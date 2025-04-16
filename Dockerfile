FROM openjdk:17

LABEL maintainer="bjl0615@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=build/libs/protfolio-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} portfolio-bongjun.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/portfolio-bongjun.jar"]