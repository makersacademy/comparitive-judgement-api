FROM openjdk:8-jdk-alpine

VOLUME /tmp

ARG JAR_FILE
ADD ${JAR_FILE} app.jar

RUN echo JAR_FILE

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
