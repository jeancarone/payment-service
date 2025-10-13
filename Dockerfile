# minimal runtime for a Java app
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# copy the jar produced by mvn verify
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
