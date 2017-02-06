FROM openjdk:8u111-jre

COPY docker-test-standalone.jar /home/docker-test-standalone.jar

EXPOSE 8080

CMD ["java", "-jar", "/home/docker-test-standalone.jar"]