FROM openjdk:8-jdk-alpine

VOLUME /tmp

ADD /build/libs/comparative-judgement-api-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
