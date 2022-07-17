FROM openjdk:11
VOLUME /tmp
WORKDIR /
ADD target/common-2.2.10.RELEASE.jar //
EXPOSE 9000
ENTRYPOINT [ "java", "-jar", "/common-2.2.10.RELEASE.jar"]
