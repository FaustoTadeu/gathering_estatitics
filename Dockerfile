FROM openjdk:8-jdk-alpine

MAINTAINER fausto.tna@hotmail.com

RUN apk update && apk add bash

RUN mkdir -p /opt/gatheringstatistics

ENV PROJECT_HOME /opt/gatheringstatistics

COPY target/gatheringstatistics.jar $PROJECT_HOME/gatheringstatistics.jar

WORKDIR $PROJECT_HOME

ENTRYPOINT ["java", "-jar", "./gatheringstatistics.jar"]
