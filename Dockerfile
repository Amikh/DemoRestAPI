FROM openjdk:8-jre-alpine3.9
COPY target/*.jar /app.jar
EXPOSE 8081
CMD ["java", "-jar", "/app.jar"]