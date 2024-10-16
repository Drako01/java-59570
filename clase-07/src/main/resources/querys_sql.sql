CREATE DATABASE IF NOT EXISTS coderhouse;
USE coderhouse;

create table persona (
	nombre varchar(20),
    apellido varchar(20)
);
insert into persona values 
	("Alejandro", "Di Stefano"),
	("Alejandro", "Perez"),
    ("Alejandro", "Di Stefano");
    
select * from persona;

select * from persona where nombre LIKE "Alejandro";

select * from persona where apellido LIKE "Di Stefano";

alter table persona add column id integer auto_increment not null primary key;

select * from persona where id = 1;

alter table persona add column dni integer  null;

update persona set dni = 20222222 where id= 1;
update persona set dni = 20222333 where id= 2;
update persona set dni = 20222444 where id= 3;

drop TABLE persona;


/*
	Ejercicios de Practica
*/

CREATE TABLE usuarios (
	id INT PRIMARY KEY AUTO_INCREMENT,
	usuario VARCHAR(20),
	nombre VARCHAR(20),
	sexo VARCHAR(1),
	nivel INT,
	email VARCHAR(50),
	telefono VARCHAR(20),
	marca VARCHAR(20),
	compania VARCHAR(20),
	saldo FLOAT,
	activo BOOLEAN
);

INSERT INTO usuarios 
VALUES 
('1','BRE2271','BRENDA','M','2','brenda@live.com','655-330-5736','SAMSUNG','IUSACELL','100','1'),
('2','OSC4677','OSCAR','H','3','oscar@gmail.com','655-143-4181','LG','TELCEL','0','1'),
('3','JOS7086','JOSE','H','3','francisco@gmail.com','655-143-3922','NOKIA','MOVISTAR','150','1'),
('4','LUI6115','LUIS','H','0','enrique@outlook.com','655-137-1279','SAMSUNG','TELCEL','50','1'),
('5','LUI7072','LUIS','H','1','luis@hotmail.com','655-100-8260','NOKIA','IUSACELL','50','0'),
('6','DAN2832','DANIEL','H','0','daniel@outlook.com','655-145-2586','SONY','UNEFON','100','1'),
('7','JAQ5351','JAQUELINE','M','0','jaqueline@outlook.com','655-330-5514','BLACKBERRY','AXEL','0','1'),
('8','ROM6520','ROMAN','H','2','roman@gmail.com','655-330-3263','LG','IUSACELL','50','1'),
('9','BLA9739','BLAS','H','0','blas@hotmail.com','655-330-3871','LG','UNEFON','100','1'),
('10','JES4752','JESSICA','M','1','jessica@hotmail.com','655-143-6861','SAMSUNG','TELCEL','500','1'),
('11','DIA6570','DIANA','M','1','diana@live.com','655-143-3952','SONY','UNEFON','100','0'),
('12','RIC8283','RICARDO','H','2','ricardo@hotmail.com','655-145-6049','MOTOROLA','IUSACELL','150','1'),
('13','VAL6882','VALENTINA','M','0','valentina@live.com','655-137-4253','BLACKBERRY','AT&T','50','0'),
('14','BRE8106','BRENDA','M','3','brenda2@gmail.com','655-100-1351','MOTOROLA','NEXTEL','150','1'),
('15','LUC4982','LUCIA','M','3','lucia@gmail.com','655-145-4992','BLACKBERRY','IUSACELL','0','1'),
('16','JUA2337','JUAN','H','0','juan@outlook.com','655-100-6517','SAMSUNG','AXEL','0','0'),
('17','ELP2984','ELPIDIO','H','1','elpidio@outlook.com','655-145-9938','MOTOROLA','MOVISTAR','500','1'),
('18','JES9640','JESSICA','M','3','jessica2@live.com','655-330-5143','SONY','IUSACELL','200','1'),
('19','LET4015','LETICIA','M','2','leticia@yahoo.com','655-143-4019','BLACKBERRY','UNEFON','100','1'),
('20','LUI1076','LUIS','H','3','luis2@live.com','655-100-5085','SONY','UNEFON','150','1'),
('21','HUG5441','HUGO','H','2','hugo@live.com','655-137-3935','MOTOROLA','AT&T','500','1');

SELECT * FROM usuarios;

/*
Consultas Bloque 1

1.	Listar los nombres de los usuarios
2.	Calcular el saldo máximo de los usuarios de sexo “Mujer”
3.	Listar nombre y teléfono de los usuarios con teléfono NOKIA, BLACKBERRY o SONY
4.	Contar los usuarios sin saldo o inactivos
5.	Listar el login de los usuarios con nivel 1, 2 o 3
6.	Listar los números de teléfono con saldo menor o igual a 300
7.	Calcular la suma de los saldos de los usuarios de la compañia telefónica NEXTEL
8.	Contar el número de usuarios por compañía telefónica
9.	Contar el número de usuarios por nivel
10.	Listar el login de los usuarios con nivel 2
11.	Mostrar el email de los usuarios que usan gmail
12.	Listar nombre y teléfono de los usuarios con teléfono LG, SAMSUNG o MOTOROLA

*/

SELECT nombre FROM usuarios;

SELECT MAX(saldo) FROM usuarios WHERE sexo = 'M';
SELECT saldo FROM usuarios WHERE sexo = 'M' ORDER BY saldo DESC;

SELECT nombre, telefono FROM usuarios WHERE marca = 'NOKIA' OR marca = 'BLACKBERRY ' OR marca = 'SONY'; /* Incorrecto */
SELECT nombre, telefono, marca FROM usuarios WHERE marca IN('NOKIA', 'BLACKBERRY', 'SONY'); /* Correcto */

SELECT COUNT(*) AS cantidad_usuarios FROM usuarios WHERE saldo <= 0 OR NOT activo;

SELECT usuario, nivel FROM usuarios WHERE nivel IN (1, 2, 3) ORDER BY 2, 1 DESC;
 
SELECT telefono, saldo FROM usuarios WHERE saldo <= 300 ORDER BY 2;
 
SELECT SUM(saldo) AS suma_saldos FROM usuarios  WHERE compania = 'NEXTEL';

SELECT COUNT(*) AS usuarios_x_compania, compania FROM usuarios GROUP By compania ORDER By compania;

SELECT COUNT(*) AS usuarios_x_nivel, nivel FROM usuarios GROUP By nivel ORDER By nivel;

SELECT usuario, nivel FROM usuarios WHERE nivel = 2;

SELECT email FROM usuarios WHERE LOWER(email) LIKE '%@gmail.com';

SELECT nombre, telefono, marca FROM usuarios WHERE marca IN('LG', 'SAMSUNG', 'MOTOROLA') ORDER By marca;
/*DROP table marcas;*/
CREATE TABLE marcas (id integer auto_increment not null primary key) SELECT marca FROM usuarios GROUP BY marca ORDER BY 1;
SELECT * FROM marcas;
ALTER TABLE usuarios ADD COLUMN id_marca INTEGER NOT NULL;
SET SQL_SAFE_UPDATES = 0;
UPDATE usuarios SET id_marca = 1 WHERE marca = 'BLACKBERRY';
UPDATE usuarios SET id_marca = 2 WHERE marca = 'LG';
UPDATE usuarios SET id_marca = 3 WHERE marca = 'MOTOROLA';
UPDATE usuarios SET id_marca = 4 WHERE marca = 'NOKIA';
UPDATE usuarios SET id_marca = 5 WHERE marca = 'SAMSUNG';
UPDATE usuarios SET id_marca = 6 WHERE marca = 'SONY';
CREATE TABLE marcas (id integer auto_increment not null primary key, marca VARCHAR(20) NULL) ;
/*INSERT INTO marcas VALUES (1, 'BLACKBERRY'),(2, 'LG'),(3, 'MOTOROLA'),(4, 'NOKIA'),(5, 'SAMSUNG'),(6, 'SONY');*/
SELECT * FROM usuarios;
ALTER TABLE usuarios DROP COLUMN marca;

SELECT 
	a.nombre, a.telefono, b.marca 
FROM 
	usuarios a , marcas b
WHERE 
	a.id_marca IN(4, 1)
AND 
	a.id_marca = b.id;

/*Integridad referencial*/
USE pruebas;
ALTER TABLE usuarios ADD foreign key (id_marca) REFERENCES marcas(id); /*Alta de Clave Foranea*/
/*foreign key*/

CREATE TABLE companias (id integer auto_increment not null primary key) SELECT compania FROM usuarios GROUP BY compania ORDER BY 1;
ALTER TABLE usuarios ADD COLUMN id_compania INTEGER NOT NULL;
SELECT compania FROM usuarios group by compania order by compania;
UPDATE usuarios SET id_compania = 1 WHERE compania = 'AT&T';
UPDATE usuarios SET id_compania = 2 WHERE compania = 'AXEL';
UPDATE usuarios SET id_compania = 3 WHERE compania = 'IUSACELL';
UPDATE usuarios SET id_compania = 4 WHERE compania = 'MOVISTAR';
UPDATE usuarios SET id_compania = 5 WHERE compania = 'NEXTEL';
UPDATE usuarios SET id_compania = 6 WHERE compania = 'TELCEL';
UPDATE usuarios SET id_compania = 7 WHERE compania = 'UNEFON';


ALTER TABLE usuarios ADD foreign key (id_compania) REFERENCES companias(id);
ALTER TABLE usuarios DROP COLUMN compania;
SELECT * FROM companias;
SELECT * FROM marcas;
SELECT * FROM usuarios;

SELECT 
	a.nombre, a.telefono, b.compania 
FROM 
	usuarios a , companias b
WHERE 
	a.id_compania IN(4, 1, 2)
AND 
	a.id_compania = b.id;

/*
Consultas Bloque 2

1.	Listar nombre y teléfono de los usuarios con teléfono que no sea de la marca LG o SAMSUNG
2.	Listar el login y teléfono de los usuarios con compañia telefónica IUSACELL
3.	Listar el login y teléfono de los usuarios con compañia telefónica que no sea TELCEL
4.	Calcular el saldo promedio de los usuarios que tienen teléfono marca NOKIA
5.	Listar el login y teléfono de los usuarios con compañia telefónica IUSACELL o AXEL
6.	Mostrar el email de los usuarios que no usan yahoo
7.	Listar el login y teléfono de los usuarios con compañia telefónica que no sea TELCEL o IUSACELL
8.	Listar el login y teléfono de los usuarios con compañia telefónica UNEFON
9.	Listar las diferentes marcas de celular en orden alfabético descendentemente
10.	Listar las diferentes compañias en orden alfabético aleatorio
11.	Listar el login de los usuarios con nivel 0 o 2
12.	Calcular el saldo promedio de los usuarios que tienen teléfono marca LG

*/

SELECT 
	U.nombre AS Nombre, U.telefono AS Teléfono, M.marca
FROM 
	usuarios U, marcas M
WHERE 
	U.id_marca = M.id 
AND
	M.marca 
NOT IN ('LG','SAMSUNG');

SELECT 
	U.usuario AS Login, U.telefono AS Teléfono, C.compania
FROM 
	usuarios U, companias C
WHERE 
	U.id_compania = C.id 
AND
	compania = 'IUSACELL';
    
SELECT 
	U.usuario AS Login, U.telefono AS Teléfono, C.compania
FROM 
	usuarios U, companias C
WHERE 
	U.id_compania = C.id 
AND
	compania <> 'TELCEL';
    
SELECT AVG(saldo) AS Promedio
FROM usuarios U, marcas M
WHERE 
	U.id_marca = M.id
AND
	M.marca = 'NOKIA';
    
SELECT 
	U.usuario AS Login, U.telefono AS Teléfono, C.compania
FROM 
	usuarios U, companias C
WHERE 
	U.id_compania = C.id 
AND
	compania IN ('IUSACELL', 'AXEL');
    
SELECT email AS EMail FROM usuarios WHERE email NOT LIKE '%@yahoo.com';

SELECT 
	U.usuario AS Login, U.telefono AS Teléfono, C.compania AS Compañía
FROM 
	usuarios U, companias C
WHERE 
	U.id_compania = C.id 
AND
	C.compania NOT IN ('IUSACELL', 'TELCEL');
    
SELECT 
	U.usuario AS Login, U.telefono AS Teléfono, C.compania AS Compañía
FROM 
	usuarios U, companias C
WHERE 
	U.id_compania = C.id 
AND
	C.compania = 'UNEFON';
    
SELECT marca FROM marcas ORDER By marca DESC;

SELECT compania FROM companias ORDER By RAND();

SELECT usuario, nivel FROM usuarios WHERE nivel IN(0,2) ORDER By nivel;

SELECT AVG(saldo) AS Promedio
FROM usuarios U, marcas M
WHERE 
	U.id_marca = M.id
AND
	M.marca = 'LG';
    
/*
Consultas Bloque 3

1.	Listar el login de los usuarios con nivel 1 o 3
2.	Listar nombre y teléfono de los usuarios con teléfono que no sea de la marca BLACKBERRY
3.	Listar el login de los usuarios con nivel 3
4.	Listar el login de los usuarios con nivel 0
5.	Listar el login de los usuarios con nivel 1
6.	Contar el número de usuarios por sexo
7.	Listar el login y teléfono de los usuarios con compañia telefónica AT&T
8.	Listar las diferentes compañias en orden alfabético descendentemente
9.	Listar el logn de los usuarios inactivos
10.	Listar los números de teléfono sin saldo
11.	Calcular el saldo mínimo de los usuarios de sexo “Hombre”
12.	Listar los números de teléfono con saldo mayor a 300

*/

SELECT 
	usuario, nivel 
FROM 
	usuarios 
WHERE 
	nivel IN(1,3) 
ORDER By nivel;

SELECT 
	U.nombre AS Nombre, U.telefono AS Teléfono, C.compania
FROM 
	usuarios U, companias C
WHERE 
	U.id_compania = C.id 
AND
	compania <> 'BLACKBERRY';
    
SELECT 
	usuario, nivel 
FROM 
	usuarios 
WHERE 
	nivel = 3;

SELECT 
	usuario, nivel 
FROM 
	usuarios 
WHERE 
	nivel = 0;

SELECT 
	usuario, nivel 
FROM 
	usuarios 
WHERE 
	nivel = 1;
    
SELECT 
	sexo, COUNT(*) AS Cantidad_Usuarios
FROM 
	usuarios 
GROUP BY 
	sexo;

SELECT 
	U.usuario AS Login, U.telefono AS Teléfono, C.compania
FROM 
	usuarios U, companias C
WHERE 
	U.id_compania = C.id 
AND
	compania = 'AT&T';
    
SELECT compania 
FROM companias 
ORDER By compania DESC;

SELECT 
	usuario AS Login, activo AS Estado
FROM 
	usuarios 
WHERE 
	activo = 0;

/*
Version PRO
SELECT 
	usuario AS Login, 
	CASE 
		WHEN activo = 0 THEN 'Inactivo'
		ELSE 'Activo'
	END AS Estado
FROM 
	usuarios
WHERE activo = 0;*/

SELECT telefono, saldo 
FROM usuarios
WHERE saldo =0;

SELECT 
	sexo AS Sexo,
	MIN(saldo) AS SaldoMinimo
FROM 
	usuarios 
WHERE 
	sexo = 'H';

SELECT 
	telefono AS Teléfono,
	saldo AS Saldo
FROM 
	usuarios 
WHERE 
	saldo > 300;


/*
Consultas Bloque 4

1.	Contar el número de usuarios por marca de teléfono
2.	Listar nombre y teléfono de los usuarios con teléfono que no sea de la marca LG
3.	Listar las diferentes compañias en orden alfabético ascendentemente
4.	Calcular la suma de los saldos de los usuarios de la compañia telefónica UNEFON
5.	Mostrar el email de los usuarios que usan hotmail
6.	Listar los nombres de los usuarios sin saldo o inactivos
7.	Listar el login y teléfono de los usuarios con compañia telefónicaIUSACELL o TELCEL
8.	Listar las diferentes marcas de celular en orden alfabético ascendentemente
9.	Listar las diferentes marcas de celular en orden alfabético aleatorio
10.	Listar el login y teléfono de los usuarios con compañia telefónica IUSACELL o UNEFON
11.	Listar nombre y teléfono de los usuarios con teléfono que no sea de la marca MOTOROLA o NOKIA
12.	Calcular la suma de los saldos de los usuarios de la compañia telefónica TELCEL

*/

/*SELECT 
	marca AS MarcaTelefono,
	COUNT(*) AS CantidadUsuarios
FROM 
	usuarios U, marcas M 
WHERE 
	U.id_marca = M.id
GROUP BY 
	M.marca;*/

/*Otra forma usando JOIN*/
SELECT 
	marca AS MarcaTelefono,
	COUNT(*) AS CantidadUsuarios
FROM 
	usuarios
JOIN marcas ON usuarios.id_marca = marcas.id
GROUP BY 
	marcas.marca;

SELECT 
	nombre AS Nombre, telefono AS Teléfono
FROM 
	usuarios 
JOIN marcas ON usuarios.id_marca = marcas.id
WHERE marcas.marca = 'LG';
    
SELECT 
	compania 
FROM companias 
ORDER by compania;

SELECT 
	SUM(saldo) AS SumaSaldos
FROM 
	usuarios 
JOIN companias ON usuarios.id_compania = companias.id
WHERE  companias.compania = 'UNEFON';

SELECT usuario AS Login, email AS EMail 
FROM usuarios 
WHERE email LIKE '%@hotmail.com';

SELECT telefono AS Teléfono, saldo AS Saldo, activo AS Estado
FROM usuarios
WHERE saldo = 0 OR NOT activo;

SELECT 
	usuario AS Login, telefono AS Teléfono, compania AS Compañía
FROM 
	usuarios 
JOIN companias ON usuarios.id_compania = companias.id
WHERE 
	companias.compania IN ('IUSACELL', 'TELCEL');
    
SELECT 
	usuario AS Login, telefono AS Teléfono, compania AS Compañía
FROM 
	usuarios 
JOIN companias ON usuarios.id_compania = companias.id
WHERE 
	companias.compania NOT IN ('MOTOROLA', 'NOKIA');
    
SELECT 
	SUM(saldo) AS SumaSaldosTELCEL
FROM 
	usuarios 
JOIN companias ON usuarios.id_compania = companias.id
WHERE companias.compania = 'TELCEL';