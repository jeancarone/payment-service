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
      agent { docker { image 'docker:27.3.1-cli' args '-v /var/run/docker.sock:/var/run/docker.sock' } }
      steps {
        sh '''
          docker build -t ${REGISTRY}/${IMAGE}:${COMMIT} .
          docker push  ${REGISTRY}/${IMAGE}:${COMMIT}
        '''
      }
    }

    stage('deploy'){
      agent { docker { image 'bitnami/kubectl:latest'
                       args '--network kind -v /var/jenkins_home/.kube:/root/.kube:ro' } }
      steps {
        sh '''
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
}
