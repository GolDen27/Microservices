FROM openjdk:11
VOLUME /tmp
WORKDIR /
ADD target/discovery-2.7.1.jar //
EXPOSE 8761
ENTRYPOINT [ "java", "-jar", "/discovery-2.7.1.jar"]
