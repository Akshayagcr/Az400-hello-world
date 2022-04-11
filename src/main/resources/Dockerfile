FROM openjdk:11.0.14-jre-slim

EXPOSE 8080
ADD app.jar app.jar
ADD applicationinsights-agent.jar applicationinsights-agent.jar
ADD applicationinsights.json applicationinsights.json

ENV _JAVA_OPTIONS '-javaagent:applicationinsights-agent.jar'

CMD ["java", "-jar", "app.jar"]