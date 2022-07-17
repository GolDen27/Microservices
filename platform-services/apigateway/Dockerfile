FROM openjdk:11
VOLUME /tmp
WORKDIR /
ADD target/apigateway-2.7.1.jar //
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/apigateway-2.7.1.jar"]
