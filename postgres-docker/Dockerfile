# Usa la imagen oficial de PostgreSQL
FROM postgres:latest

# Establecer las variables de entorno para el usuario y la base de datos
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres
ENV POSTGRES_DB=postgres

# Copiar el archivo SQL que crea la tabla y agrega datos
COPY init.sql /docker-entrypoint-initdb.d/

# Exponer el puerto de PostgreSQL
EXPOSE 5432