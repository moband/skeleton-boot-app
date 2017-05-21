FROM openjdk:8-jre-alpine
MAINTAINER Mohammad Reza Alagheband

VOLUME /tmp
ADD skeleton-app-1.0.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]