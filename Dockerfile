FROM openjdk:1.8-alpine
ADD target/docker.jar docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker.jar"]