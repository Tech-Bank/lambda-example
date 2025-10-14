# Użyj oficjalnego obrazu Javy jako bazowego
FROM eclipse-temurin:21-jdk-alpine

# Ustaw katalog roboczy
WORKDIR /app

# Skopiuj plik JAR do obrazu
COPY target/*.jar app.jar

# Uruchom aplikację
ENTRYPOINT ["java", "-jar", "app.jar"]