FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/ecs-fargate-guide-0.0.1-SNAPSHOT.jar /app/ecs-fargate-guide.jar

EXPOSE 8080

CMD ["java", "-jar", "ecs-fargate-guide.jar"]