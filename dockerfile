FROM openjdk:17-jdk-alpine
COPY my-app-0.0.2-SNAPSHOT.jar /usr/app/
EXPOSE 8080
ENTRYPOINT /bin/sh -c "java -jar /usr/app/my-app-0.0.2-SNAPSHOT.jar"