FROM openjdk:11
LABEL maintainer="kiranimart.com"
ADD /build/libs/kiranibackend-code-0.0.1-SNAPSHOT.jar kiranibackend-code-0.0.1-SNAPSHOT.jar
EXPOSE 9192
ENTRYPOINT ["java","-jar","kiranibackend-code-0.0.1-SNAPSHOT.jar"]
