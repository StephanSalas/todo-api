FROM openjdk:8-alpine
VOLUME /tmp
ADD build/libs/api-0.0.1-SNAPSHOT.jar springboot-docker-compose.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","springboot-docker-compose.jar"]