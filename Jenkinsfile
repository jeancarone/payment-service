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




  }

  post {
    failure { echo "pipeline failed" }
    success { echo "pipeline succeeded" }
  }
}
