#base image
FROM openjdk:jdk-alpine

#give the mainatiner name
MAINTAINER melvinkimathi

#copy the jar file ---> COPY [source]   [destination]
COPY target/spring-boot-docker-REST-0.0.1-SNAPSHOT.jar /deployments/

#command to run the the container is starting
CMD java -jar /deployments/spring-boot-docker-REST-0.0.1-SNAPSHOT.jar
