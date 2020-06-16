FROM openjdk:8-jdk-alpine

EXPOSE 18080

ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} demo.jar

ENTYPOINT["java", "-jar", "demo.jar"]