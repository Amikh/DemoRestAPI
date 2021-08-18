FROM openjdk:8-jre-alpine3.9

COPY target/*.jar /app.jar
 
CMD ["java", "-jar", "/app.jar"]