# minimal runtime for a Java app (multi-arch incl. arm64)
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
