pipeline {
  agent any
  environment {
    REGISTRY = "localhost:5001"
    IMAGE = "dora-spring"
    COMMIT = sh(script: "git rev-parse --short HEAD", returnStdout: true).trim()
    KUBECONFIG = "${env.WORKSPACE}/.kube/config"
  }
  stages {
    stage('checkout'){ steps { checkout scm } }

    stage('build & test'){
      steps { sh 'mvn -B -DskipTests=false clean verify' }
    }

    stage('docker build & push'){
      steps {
        sh '''
          docker build -t ${REGISTRY}/${IMAGE}:${COMMIT} .
          docker push  ${REGISTRY}/${IMAGE}:${COMMIT}
        '''
      }
    }

    stage('deploy'){  // <— DevLake will treat jobs matching /deploy/ as deployments
      steps {
        sh '''
          # simple K8s rollout (Deployment named app in namespace demo)
          kubectl create ns demo --dry-run=client -o yaml | kubectl apply -f -
          cat <<EOF | kubectl apply -n demo -f -
          apiVersion: apps/v1
          kind: Deployment
          metadata: { name: app }
          spec:
            replicas: 1
            selector: { matchLabels: { app: app } }
            template:
              metadata: { labels: { app: app } }
              spec:
                containers:
                  - name: app
                    image: ${REGISTRY}/${IMAGE}:${COMMIT}
                    ports: [{containerPort: 8080}]
          EOF
          kubectl -n demo rollout status deploy/app --timeout=120s
        '''
      }
    }
  }
  post {
    failure { echo "pipeline failed" }
    success { echo "pipeline succeeded" }
  }
}
