FROM ubuntu:22.04 as build

RUN apt-get update -y && \
    apt-get install -y openjdk-17-jdk maven

WORKDIR /app

COPY . .

RUN mvn clean install -DskipTests

FROM openjdk:17-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar simple-user-authentication-api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "simple-user-authentication-api.jar"]