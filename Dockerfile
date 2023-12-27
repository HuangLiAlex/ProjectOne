FROM openjdk:17-jdk-alpine
MAINTAINER alex.com
COPY target/one-0.0.1.jar springboot-one.jar
ENTRYPOINT ["java","-jar","/springboot-one.jar"]