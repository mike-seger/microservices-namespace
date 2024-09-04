FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=apps/gateway/build//libs/gateway-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
