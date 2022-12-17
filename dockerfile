FROM openjdk:17-jdk-alpine
COPY my-api-0.0.8-SNAPSHOT.jar /usr/app/
EXPOSE 8080
ENTRYPOINT /bin/sh -c "java -jar /usr/app/my-api-0.0.8-SNAPSHOT.jar"