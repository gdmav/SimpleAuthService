FROM openjdk:17
EXPOSE 8080
COPY build/libs/goode-auth-service-0.0.1-SNAPSHOT.jar /usr/simple-auth-service.jar
ENTRYPOINT [ "java", "-jar", "/usr/simple-auth-service.jar"]