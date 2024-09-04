FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=apps/microservice-1/build//libs/microservice-1-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
