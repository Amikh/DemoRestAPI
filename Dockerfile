FROM openjdk:11-alpine

ARG WAR_FILE=./target/*.jar

COPY ${WAR_FILE} app.jar

CMD ["java", "-Dspring.profiles.active=docker", "-jar", "app.jar"]