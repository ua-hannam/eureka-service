FROM amazoncorretto:17-alpine

ARG JAR_FILE=build/libs/eureka-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} eurekaService.jar

CMD ["java", "-jar", "-Duser.timezone=Asia/Seoul", "eurekaService.jar"]