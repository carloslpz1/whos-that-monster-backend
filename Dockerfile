FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw -q -DskipTests clean package

FROM eclipse-temurin:17-jre
WORKDIR /app

ENV PORT=8080
EXPOSE 8080

COPY --from=build /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]