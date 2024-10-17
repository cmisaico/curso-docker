const express = require('express');
const app = express();
const port = 3000;

// Mock de artículos de autos
const autos = [
    {
        id: 1,
        name: 'Toyota Corolla',
        data: {
            year: 2020,
            color: 'Rojo',
            engine: '2.0L',
            type: 'Sedán'
        }
    },
    {
        id: 2,
        name: 'Honda Civic',
        data: {
            year: 2019,
            color: 'Negro',
            engine: '1.8L',
            type: 'Sedán'
        }
    },
    {
        id: 3,
        name: 'Ford Mustang',
        data: {
            year: 2021,
            color: 'Azul',
            engine: '5.0L',
            type: 'Coupé'
        }
    }
];

// Ruta para obtener un artículo por su ID
app.get('/apiNode/article/:id', (req, res) => {
    const id = parseInt(req.params.id, 10);  // Convertir el ID a entero
    const auto = autos.find(a => a.id === id);

    if (auto) {
        res.json(auto);
    } else {
        res.status(404).json({ error: 'Auto no encontrado' });
    }
});

// Servidor escuchando en el puerto 3000
app.listen(port, () => {
    console.log(`Servidor corriendo en http://localhost:${port}`);
});