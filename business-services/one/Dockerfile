FROM openjdk:11
VOLUME /tmp
WORKDIR /
ADD target/one-0.0.1-SNAPSHOT.jar //
EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "/one-0.0.1-SNAPSHOT.jar"]
