-- Crear la tabla articles
CREATE TABLE IF NOT EXISTS articles (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- Insertar datos en la tabla articles
INSERT INTO articles (id, name) VALUES
(1, 'Refrigerador LG'),
(2, 'Lavadora Samsung'),
(3, 'Microondas Panasonic'),
(4, 'Aspiradora Dyson'),
(5, 'Televisor Sony');