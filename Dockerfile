FROM openjdk:17
ADD target/demo-service.jar demo-service.jar
ENTRYPOINT ["java", "-jar", "/demo-service.jar"]