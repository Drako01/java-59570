CREATE DATABASE	IF NOT EXISTS coder_pruebas;
USE coder_pruebas;

/*
FOREIGN KEY
Una Foreign Key (Clave Foránea) es un campo en una tabla que se utiliza para establecer una relación con 
la clave primaria de otra tabla. Nos permite conectar datos entre diferentes tablas.
*/

-- Tabla Estudiantes
CREATE TABLE Estudiantes (
    id_estudiante INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50)
);

-- Tabla Cursos
CREATE TABLE Cursos (
    id_curso INT PRIMARY KEY,
    nombre_curso VARCHAR(50),
    id_estudiante INT,
    FOREIGN KEY (id_estudiante) REFERENCES Estudiantes(id_estudiante)
);

CREATE TABLE Pasaportes (
    id_pasaporte INT PRIMARY KEY,
    id_estudiante INT UNIQUE,
    fecha_expiracion DATE,
    FOREIGN KEY (id_estudiante) REFERENCES Estudiantes(id_estudiante)
);

-- Crear tabla Profesores
CREATE TABLE Profesores (
    id_profesor INT PRIMARY KEY,
    nombre_profesor VARCHAR(50),
    curso_asignado INT,
    FOREIGN KEY (curso_asignado) REFERENCES Cursos(id_curso)
);


INSERT INTO Estudiantes (id_estudiante, nombre, apellido) VALUES 
(1, 'Juan', 'Pérez'),
(2, 'María', 'Gómez'),
(3, 'Carlos', 'López'),
(4, 'Ana', 'Martínez'),
(5, 'Luis', 'Fernández');

INSERT INTO Cursos (id_curso, nombre_curso, id_estudiante) VALUES 
(101, 'Matemáticas', 1),
(102, 'Ciencias', 2),
(103, 'Historia', 3),
(104, 'Matemáticas', 4),
(105, 'Inglés', 5);

INSERT INTO Pasaportes (id_pasaporte, id_estudiante, fecha_expiracion) VALUES 
(1001, 1, '2025-08-30'),
(1002, 2, '2025-08-30'),
(1003, 3, '2027-05-15'),
(1004, 4, '2026-12-01'),
(1005, 5, '2024-11-20');

-- Datos para la tabla Profesores
INSERT INTO Profesores (id_profesor, nombre_profesor, curso_asignado) VALUES 
(1, 'Laura García', 101),
(2, 'Pedro Ramírez', 102),
(3, 'Lucía Díaz', 104); 

/*
INNER JOIN
Combina filas de dos tablas solo si existe una coincidencia en ambas.

Este ejemplo muestra los estudiantes que están inscritos en algún curso. Si un estudiante no está inscrito en ningún curso, no aparecerá en el resultado.

Qué hace: Muestra solo las filas donde hay coincidencias en ambas tablas.
Resultado: Si un estudiante no está inscrito en ningún curso, o si un curso no tiene estudiantes, no aparecerán en el resultado.
Ejemplo: Solo se listarán los estudiantes que están efectivamente inscritos en algún curso.
*/

SELECT Estudiantes.nombre, Cursos.nombre_curso
FROM Estudiantes
INNER JOIN Cursos ON Estudiantes.id_estudiante = Cursos.id_estudiante;

/*
LEFT JOIN (o LEFT OUTER JOIN)
Incluye todas las filas de la tabla izquierda (en este caso, Estudiantes), aunque no haya coincidencias en la tabla derecha (Cursos).

Este ejemplo muestra todos los estudiantes, incluso aquellos que no están inscritos en ningún curso. Si un estudiante no está en un curso, el valor de nombre_curso será NULL.

Qué hace: Muestra todas las filas de la tabla de la izquierda (Estudiantes), incluso si no tienen coincidencias en la tabla derecha (Cursos).
Resultado: Todos los estudiantes aparecerán en el resultado, y si un estudiante no está inscrito en ningún curso, el valor de nombre_curso será NULL.
Ejemplo: Incluye todos los estudiantes, independientemente de si están o no en un curso.
*/

SELECT Estudiantes.nombre, Cursos.nombre_curso
FROM Estudiantes
LEFT JOIN Cursos ON Estudiantes.id_estudiante = Cursos.id_estudiante;

/*
 RIGHT JOIN (o RIGHT OUTER JOIN)
Incluye todas las filas de la tabla derecha (Cursos), aunque no haya coincidencias en la tabla izquierda (Estudiantes).

Muestra todos los cursos, incluyendo aquellos en los que no hay estudiantes inscritos. Si un curso no tiene estudiantes inscritos, el valor de nombre será NULL.

Qué hace: Muestra todas las filas de la tabla derecha (Cursos), incluso si no tienen coincidencias en la tabla izquierda (Estudiantes).
Resultado: Todos los cursos aparecerán en el resultado, y si un curso no tiene estudiantes inscritos, el valor de nombre del estudiante será NULL.
Ejemplo: Incluye todos los cursos, independientemente de si tienen o no estudiantes inscritos.
*/

SELECT Estudiantes.nombre, Cursos.nombre_curso
FROM Estudiantes
RIGHT JOIN Cursos ON Estudiantes.id_estudiante = Cursos.id_estudiante;

/*
FULL JOIN (o FULL OUTER JOIN)
Combina todas las filas de ambas tablas y muestra las coincidencias, así como las filas no coincidentes de cada lado.

Muestra todos los estudiantes y todos los cursos, combinándolos cuando hay coincidencias y mostrando NULL cuando no las hay.

Qué hace: Muestra todas las filas de ambas tablas, tanto si hay coincidencias como si no las hay.
Resultado: Incluye tanto los estudiantes que no están inscritos en ningún curso como los cursos que no tienen estudiantes inscritos, mostrando NULL donde no hay coincidencias.
Ejemplo: Lista todos los estudiantes y todos los cursos, combinando las coincidencias y mostrando NULL cuando no las hay.
*/
SELECT Estudiantes.nombre, Cursos.nombre_curso
FROM Estudiantes
FULL JOIN Cursos ON Estudiantes.id_estudiante = Cursos.id_estudiante;


/*
Diferencias clave en el resultado:
INNER JOIN: Solo muestra las coincidencias.
LEFT JOIN: Muestra todos los registros de la tabla izquierda, aunque no haya coincidencias en la derecha.
RIGHT JOIN: Muestra todos los registros de la tabla derecha, aunque no haya coincidencias en la izquierda.
FULL JOIN: Muestra todos los registros de ambas tablas, combinando coincidencias y mostrando NULL donde no hay coincidencias.
*/

/*///////////////////////////////////////////////////////////////////////////////////////////////////////////////*/

/*
JOIN con la tabla Profesores
Para ver una combinación más compleja, podemos realizar un INNER JOIN que incluya también la tabla Profesores.

Este ejemplo muestra la lista de estudiantes, el curso en el que están inscritos y el profesor que imparte ese curso. 
Solo se mostrarán los registros cuando existan coincidencias en todas las tablas.
*/

SELECT Estudiantes.nombre AS Estudiante, Cursos.nombre_curso AS Curso, Profesores.nombre_profesor AS Profesor
FROM Estudiantes
INNER JOIN Cursos ON Estudiantes.id_estudiante = Cursos.id_estudiante
INNER JOIN Profesores ON Cursos.id_curso = Profesores.curso_asignado;

/*
Explicación visual de los JOINs:
-------------------------------
INNER JOIN: Devuelve solo las filas que tienen coincidencias en ambas tablas.
LEFT JOIN: Devuelve todas las filas de la tabla izquierda y las coincidencias de la tabla derecha (o NULL si no hay coincidencias).
RIGHT JOIN: Devuelve todas las filas de la tabla derecha y las coincidencias de la tabla izquierda (o NULL si no hay coincidencias).
FULL JOIN: Devuelve todas las filas cuando hay coincidencias en una u otra tabla, incluyendo filas sin coincidencias en ambos lados.

Resumen
-------
Estos ejemplos te ayudarán a entender cómo funcionan las distintas combinaciones de JOIN y cómo puedes utilizarlas para trabajar con datos relacionados en bases de datos. 
Es una herramienta muy poderosa para extraer y combinar información de diferentes tablas.
*/