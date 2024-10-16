create database if not exists coder_relaciones;
use coder_relaciones;

create table Estudiantes (
	id_estudiante int primary key auto_increment,
	nombre varchar(50),
	apellido varchar(50)
);

create table Cursos (
	id_curso int primary key auto_increment,
	nombre_curso varchar(50),
	id_estudiante int,
	foreign key (id_estudiante) references Estudiantes(id_estudiante)
);

insert into Estudiantes (nombre, apellido) values
	("Alejandro", "Di Stefano"),
    ("Ana", "Vargas"),
    ("Federico", "Di Iorio"),
	("Tristan", "Lenzberg"),
    ("Estudiante", "Sin Curso");
     

insert into Cursos (nombre_curso, id_estudiante) values
	("Java", 1),
    ("SQL", 2),
    ("JavaScript", 3),
    ("Angular", 4),
    ("Curso S/A", null);
    


/*
INNER JOIN
*/
select Estudiantes.nombre, Cursos.nombre_curso
from Estudiantes
inner join Cursos on Estudiantes.id_estudiante = Cursos.id_estudiante;

/*
LEFT JOIN
*/
select Estudiantes.nombre, Cursos.nombre_curso
from Estudiantes
left join Cursos on Estudiantes.id_estudiante = Cursos.id_estudiante;

/*
RIGHT JOIN
*/
select Estudiantes.nombre, Cursos.nombre_curso
from Estudiantes
RIGHT join Cursos on Estudiantes.id_estudiante = Cursos.id_estudiante;

/*
FULL JOIN
*/
SELECT Estudiantes.nombre, Cursos.nombre_curso
FROM Estudiantes
FULL JOIN Cursos ON Estudiantes.id_estudiante = Cursos.id_estudiante;

create table Pasaportes (
	id_pasaporte int primary key auto_increment,
    id_estudiante int unique,
    fecha_expiracion date,
    foreign key (id_estudiante) references Estudiantes(id_estudiante)
    );
    
INSERT INTO Pasaportes (id_pasaporte, id_estudiante, fecha_expiracion) VALUES 
	(1001, 1, '2025-08-30'),
	(1002, 2, '2025-08-30'),
	(1003, 3, '2027-05-15'),
	(1004, 4, '2026-12-01'),
	(1005, 5, '2024-11-20');
 
 CREATE TABLE Profesores (
    id_profesor INT PRIMARY KEY auto_increment,
    nombre_profesor VARCHAR(50),
    curso_asignado INT,
    FOREIGN KEY (curso_asignado) REFERENCES Cursos(id_curso)
);

INSERT INTO Profesores (id_profesor, nombre_profesor, curso_asignado) VALUES 
	(1, 'Laura García', 1),
	(2, 'Pedro Ramírez', 2),
	(3, 'Lucía Díaz', 4); 



SELECT Estudiantes.nombre AS E, Cursos.nombre_curso AS C, Profesores.nombre_profesor AS P
FROM Estudiantes
INNER JOIN Cursos ON Estudiantes.id_estudiante = Cursos.id_estudiante
INNER JOIN Profesores ON Cursos.id_curso = Profesores.curso_asignado;


select * from Estudiantes;
select * from Cursos;
select * from Profesores;
select * from Pasaportes;

/*En caso de querer eliminar un dato relacionado con una FK, hay que deshabilitar primero las FK y luego rehabilitarlas*/
SET FOREIGN_KEY_CHECKS = 0;
delete from Estudiantes where id_estudiante = 5;
SET FOREIGN_KEY_CHECKS = 1;


INSERT INTO Profesores (nombre_profesor, curso_asignado) VALUES 
	('Laura Idalgo', 2),
	('Pedro Vargas', 2),
	('Lucía Perez', 5); 

/*
Para cambiar la contraseña de root
	ALTER USER 'root'@'localhost' IDENTIFIED BY 'NuevaContraseña';
*/