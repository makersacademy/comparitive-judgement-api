FROM openjdk:8-jdk-alpine

VOLUME /tmp

EXPOSE 80

ADD /build/libs/comparative-judgement-api-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
