FROM openjdk:11
VOLUME /tmp
WORKDIR /
ADD target/two-0.0.1-SNAPSHOT.jar //
EXPOSE 8082
ENTRYPOINT [ "java", "-jar", "/two-0.0.1-SNAPSHOT.jar"]
