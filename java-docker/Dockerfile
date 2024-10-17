# Etapa de construcción
FROM maven:3.8.5-openjdk-17-slim AS build

LABEL maintainer="christianmisaico@gmail.com"

# Copiar el archivo pom.xml y el directorio src
COPY pom.xml /app/
COPY src /app/src/

WORKDIR /app

# Descargar las dependencias del proyecto
RUN mvn dependency:go-offline

# Compilar y empaquetar la aplicación
RUN mvn package -DskipTests

# Etapa de ejecución
FROM openjdk:17-ea-27-slim

WORKDIR /app

# Copiar el archivo JAR de la etapa de construcción
COPY --from=build /app/target/java-docker-0.0.1-SNAPSHOT.jar ./app.jar

# Crear un usuario no root
RUN useradd -m cmisaico
USER cmisaico

EXPOSE 8001

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/app.jar"]
