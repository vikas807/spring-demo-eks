#base docker image
FROM openjdk:18
LABEL maintainer="Vikas Pal"
ADD target/springboot-docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]
