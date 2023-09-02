FROM openjdk:17
ADD target/score-service.jar score-service.jar
ENTRYPOINT ["java", "-jar", "score-service.jar"]
