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

    stage('deploy') {
agent {
  docker {
    image 'rancher/kubectl:v1.30.4'
    args  '-v /var/jenkins_home/.kube:/root/.kube:ro'
    reuseNode true
  }
}
      steps {
        sh '''
          kubectl create ns ${NAMESPACE} --dry-run=client -o yaml | kubectl apply -f -

          cat <<EOF | kubectl apply -n ${NAMESPACE} -f -
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

          kubectl -n ${NAMESPACE} rollout status deploy/${DEPLOYMENT} --timeout=120s
        '''
      }
    }
  }

  post {
    failure { echo "pipeline failed" }
    success { echo "pipeline succeeded" }
  }
}
