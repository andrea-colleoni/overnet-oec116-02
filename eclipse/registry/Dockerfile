FROM openjdk:16-jdk-slim
EXPOSE 8761/tcp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]