mvn -B -f ../pom.xml clean verify sonar:sonar \
  -Dtest='**/*IT,**/*IntegrationTest' \
  -Dsonar.projectKey=payment-service-it \
  -Dsonar.projectName='payment-service (integration tests)' \
  -Dsonar.sources=src/main/java \
  -Dsonar.tests=src/test/java \
  -Dsonar.test.inclusions='**/*IT.java,**/*IntegrationTest.java' \
  -Dsonar.junit.reportPaths=target/surefire-reports \
  -Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml \
  -Dsonar.host.url="http://localhost:9000" -Dsonar.token="squ_343da3f0ca0f2f7441d304b471a219070a581e62" # FIXME: <- Set these!