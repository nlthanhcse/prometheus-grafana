FROM openjdk:17
LABEL authors="Michaelcse"
EXPOSE 9999

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} prometheus-grafana.jar

ENTRYPOINT [ "java", "-jar", "/prometheus-grafana.jar"]