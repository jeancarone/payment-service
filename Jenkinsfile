pipeline {
  agent any

  environment {
    REGISTRY    = "localhost:5001"
    IMAGE       = "payment-service"
    COMMIT      = sh(script: "git rev-parse --short HEAD", returnStdout: true).trim()
    NAMESPACE   = "demo"
    DEPLOYMENT  = "payment-service"
  }

  stages {
    stage('build & test') {
      steps { sh 'mvn -B -DskipTests=false clean verify' }
    }

    stage('docker build & push') {
      agent {
        docker {
          image 'docker:27.3.1-cli'                  // <— REQUIRED on its own line
          args  '-v /var/run/docker.sock:/var/run/docker.sock'
          reuseNode true
        }
      }
      steps {
        sh '''
          docker version
          docker build -t ${REGISTRY}/${IMAGE}:${COMMIT} .
          docker push  ${REGISTRY}/${IMAGE}:${COMMIT}
        '''
      }
    }

stage('deploy'){
  agent {
    docker {
      image 'dtzar/helm-kubectl:3.16.2'  // has kubectl + sh + cat
      args  '-v /var/jenkins_home/.kube:/root/.kube:ro --network kind'
      reuseNode true
    }
  }
  environment {
    KUBECONFIG = '/root/.kube/config'
  }
  steps {
    sh '''
      set -euo pipefail

      echo "KUBECONFIG=$KUBECONFIG"
      [ -f "$KUBECONFIG" ] || { echo "ERROR: $KUBECONFIG not found"; exit 2; }

      echo -n "API server in kubeconfig: "
      kubectl --kubeconfig="$KUBECONFIG" config view --minify -o jsonpath='{.clusters[0].cluster.server}'
      echo

      # sanity
      kubectl --kubeconfig="$KUBECONFIG" version --client
      kubectl --kubeconfig="$KUBECONFIG" cluster-info

      # your original steps
      kubectl --kubeconfig="$KUBECONFIG" create ns ${NAMESPACE} --dry-run=client -o yaml | \
      kubectl --kubeconfig="$KUBECONFIG" apply --validate=false -f -

      cat <<EOF | kubectl --kubeconfig="$KUBECONFIG" apply -n ${NAMESPACE} -f -
      apiVersion: apps/v1
      kind: Deployment
      metadata: { name: ${DEPLOYMENT} }
      spec:
        replicas: 1
        selector: { matchLabels: { app: ${DEPLOYMENT} } }
        template:
          metadata: { labels: { app: ${DEPLOYMENT} } }
          spec:
            containers:
              - name: ${DEPLOYMENT}
                image: ${REGISTRY}/${IMAGE}:${COMMIT}
                ports: [{ containerPort: 8080 }]
      EOF

      kubectl --kubeconfig="$KUBECONFIG" -n ${NAMESPACE} rollout status deploy/${DEPLOYMENT} --timeout=120s
    '''
  }
}



  }

  post {
    failure { echo "pipeline failed" }
    success { echo "pipeline succeeded" }
  }
}
