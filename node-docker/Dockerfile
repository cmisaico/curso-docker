# Usa una imagen base de Node.js
# FROM node:20
FROM node:20.18.0-alpine

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /usr/src/app

# Copia el archivo package.json y package-lock.json
COPY package*.json ./

# Instala las dependencias de la aplicación
RUN npm install

# Copia el resto de los archivos de la aplicación
COPY app.js .

# Expone el puerto que usa la aplicación
EXPOSE 3000

# Define el comando para ejecutar la aplicación
CMD ["node", "app.js"]
