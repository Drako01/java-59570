CREATE DATABASE	IF NOT EXISTS coderhouse;
USE coderhouse;

create table alumno(
	nombre varchar(20),
    apellido varchar(20)
);

select * from alumno;

insert into alumno values
	("Alejandro" , "Di Stefano"),
    ("Alejandro" , "Perez"),
    ("Lionel" , "Messi");
    
alter table alumno add column id integer auto_increment not null primary key;

alter table alumno add column dni integer null;

insert into alumno (nombre, apellido) values
	("Ariel" , "Gomez"),
    ("Diego", "Perez");
    
update alumno set dni = 23232323 where id = 1;
update alumno set dni = 23232323 where id = 2;
update alumno set dni = 23232323 where id = 3;
update alumno set dni = 23232323 where id = 4;
update alumno set dni = 23232323 where id = 5;

drop table alumno;


CREATE DATABASE IF NOT EXISTS coderhouse;
USE coderhouse;

CREATE TABLE usuarios (
   idx INT PRIMARY KEY AUTO_INCREMENT,
   usuario VARCHAR(20),
   nombre VARCHAR(20),
   sexo VARCHAR(1),
   nivel TINYINT,
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


select * from usuarios;

/*
BLOQUE 1
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

select nombre from usuarios;
select usuario from usuarios;

select max(saldo) from usuarios where sexo = 'M';
select nombre, telefono from usuarios where marca = 'NOKIA' or marca = 'BLACKBERRY' or marca = 'SONY'; /* Esto esta mal*/
select nombre, telefono from usuarios where marca in('NOKIA', 'BLACKBERRY', 'SONY');
select count(*) as cantidad_usuarios from usuarios where saldo <= 0 or NOT activo;
select usuario, nivel from usuarios where nivel in(1, 2, 3) order by 2, 1 desc;
select nombre, telefono, saldo from usuarios where saldo <= 300 order by 3 desc;
select sum(saldo) as suma_saldos from usuarios where compania = 'MOVISTAR';
select saldo from usuarios where compania = 'MOVISTAR';
select count(*) as usuarios_x_compania, compania from usuarios group by compania order by compania;
select count(*) as usuarios_x_nivel, nivel from usuarios group by nivel order by nivel desc;
select usuario, nivel from usuarios where nivel = 2;
select nombre, email from usuarios where lower(email) like '%@gmail.com%';
select nombre, telefono from usuarios where marca in('LG', 'SAMSUNG', 'MOTOROLA');

/*
BLOQUE 2
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

select nombre, telefono, marca from usuarios where marca not in('LG', 'SAMSUNG');



/*
BLOQUE 3
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

/*
BLOQUE 4
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