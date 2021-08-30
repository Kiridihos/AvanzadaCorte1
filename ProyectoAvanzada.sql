CREATE TABLE empleado (
  carnet numeric(10),
  tipo_empleado varchar(20),
  nombre varchar(20),
  es_profesional bool,
  universidad_egresada varchar(30),
  celular numeric(10),
  PRIMARY KEY (carnet)
);

CREATE TABLE evento (
  codigo numeric(10),
  nombre varchar(50),
  fecha_inicio date,
  fecha_fin date,
  directivo_asignado numeric(10),
  salario_directivo numeric(10),
  empleado_raso_asignado numeric(10),
  salario_empleado_raso numeric(10),
  PRIMARY KEY (codigo),
  FOREIGN KEY (directivo_asignado)
  references empleado(carnet),
  FOREIGN KEY (empleado_raso_asignado)
  references empleado(carnet)
);


CREATE TABLE agencia (
codigo numeric(20),
nombre varchar(20),
pais varchar(20),
ano_creacion varchar(4),
correo_electronico varchar(30),
nombre_dueno varchar(20),
PRIMARY KEY (codigo));


CREATE TABLE portafolio (
numero_portafolio numeric(10),
foto numeric(10),
objetivo varchar(50),
ano_creacion varchar(4),
PRIMARY KEY (numero_portafolio)
);


CREATE TABLE modelo (
  pasaporte numeric(10),
  pais varchar(50),
  nombre varchar(50),
  fecha_nacimiento date,
  color_ojos varchar(50),
  color_piel varchar(50),
  estatura float(8),
  cintura float(8),
  busto float(8),
  talla_zapatos numeric(2),
  peso float(8),
  particularidades varchar(50),
  agencia numeric(10),
  portafolio_de_presentacion numeric(10),
  PRIMARY KEY (pasaporte),
  FOREIGN KEY (agencia)
  references agencia(codigo),
  FOREIGN KEY (portafolio_de_presentacion)
  references portafolio(numero_portafolio)
);


CREATE TABLE historico_modelo (
  id_historico numeric(10),
  pasaporte numeric(10),
  color_ojos varchar(10),
  color_piel varchar(20),
  estatura float(8),
  cintura float(8),
  busto float(8),
  talla_zapatos numeric(2),
  peso float(8),
  fecha_actualizacion date,
  PRIMARY KEY (id_historico),
  FOREIGN KEY (pasaporte)
  REFERENCES modelo(pasaporte)
);

CREATE TABLE disenador (
pasaporte numeric(10),
nombre varchar(50),
pais_origen varchar(50),
PRIMARY KEY (pasaporte)
);


CREATE TABLE banda (
id_banda numeric(10),
nombre_banda varchar(20),
fecha_creacion date,
miembro1 varchar(20),
miembro2 varchar(20),
miembro3 varchar(20),
miembro4 varchar(20),
PRIMARY KEY (id_banda)
);



CREATE TABLE artista (
codigo numeric(10),
nombre_artistico varchar(20),
genero_musical varchar(20),
solista_grupal varchar(10),
contrato_auxiliar varchar (10),
es_banda bool,
banda numeric(10),
PRIMARY KEY (codigo),
FOREIGN KEY (banda)
REFERENCES banda(id_banda)
);

CREATE TABLE pabellon (
nombre varchar(50),
empleado_responsable numeric(10),
telefono numeric(10),
PRIMARY KEY (nombre),
FOREIGN KEY (empleado_responsable)
references empleado(carnet)
);


CREATE TABLE desfile (
numero numeric(10),
fecha date,
hora time,
nombre_coleccion varchar(50),
disenador numeric(10),
pabellon varchar(50),
modelo numeric(10),
salario_modelo numeric(10),
artista numeric(10),
salario_artista numeric(10),
evento_asignado numeric(10),
PRIMARY KEY (numero),
foreign key (disenador)
references disenador(pasaporte),
FOREIGN KEY (pabellon)
references pabellon(nombre),
FOREIGN KEY (modelo)
references modelo(pasaporte),
FOREIGN KEY (artista)
references artista(codigo),
FOREIGN KEY (evento_asignado)
references evento(codigo)
);




INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000001,'raso','Jose Garzon','FALSE',NULL,3122748675);
INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000002,'directivo','Felipe Perez','TRUE','Universidad Jorge Tadeo Lozano',3134137898);
INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000003,'raso','Camilo Carrera','FALSE',NULL,3158976543);
INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000004,'raso','Sandra Bonel','FALSE',NULL,3058888216);
INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000005,'raso','Daniel Rueda','FALSE',NULL,3058865632);
INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000006,'directivo','Martha Martinez','TRUE','Universidad de los andes',3013125467);
INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000007,'directivo','Lucia Layton','TRUE','Universidad nacional',3103128040);
INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000008,'raso','Jorge Mendez','FALSE',NULL,3123207687);
INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000009,'raso','Wilson Caceres','FALSE',NULL,3156783454);
INSERT INTO empleado(carnet,tipo_empleado,nombre,es_profesional,universidad_egresada,celular) VALUES (1000010,'raso','Andres Luque','FALSE',NULL,3057652131);



INSERT INTO evento(codigo,nombre,fecha_inicio,fecha_fin,directivo_asignado,salario_directivo,empleado_raso_asignado,salario_empleado_raso) VALUES (1,'primavera','2021/08/26','2021/08/26',1000002,2000000,1000001,1500000);
INSERT INTO evento(codigo,nombre,fecha_inicio,fecha_fin,directivo_asignado,salario_directivo,empleado_raso_asignado,salario_empleado_raso) VALUES (2,'otoño','2021/08/27','2021/08/27',1000006,2000000,1000003,1500000);
INSERT INTO evento(codigo,nombre,fecha_inicio,fecha_fin,directivo_asignado,salario_directivo,empleado_raso_asignado,salario_empleado_raso) VALUES (3,'verano','2021/08/28','2021/08/28',1000007,2000000,1000004,1500000);
INSERT INTO evento(codigo,nombre,fecha_inicio,fecha_fin,directivo_asignado,salario_directivo,empleado_raso_asignado,salario_empleado_raso) VALUES (4,'invierno','2015/05/12','2015/05/12',1000002,2000000,1000005,1500000);
INSERT INTO evento(codigo,nombre,fecha_inicio,fecha_fin,directivo_asignado,salario_directivo,empleado_raso_asignado,salario_empleado_raso) VALUES (5,'fashion nova','2015/05/13','2015/05/13',1000006,2000000,1000008,1500000);
INSERT INTO evento(codigo,nombre,fecha_inicio,fecha_fin,directivo_asignado,salario_directivo,empleado_raso_asignado,salario_empleado_raso) VALUES (6,'Covid Friday','2015/05/14','2015/05/14',1000007,2000000,1000009,1500000);
INSERT INTO evento(codigo,nombre,fecha_inicio,fecha_fin,directivo_asignado,salario_directivo,empleado_raso_asignado,salario_empleado_raso) VALUES (7,'Domingos Felices','2020/03/01','2020/03/01',1000002,2000000,1000010,1500000);
INSERT INTO evento(codigo,nombre,fecha_inicio,fecha_fin,directivo_asignado,salario_directivo,empleado_raso_asignado,salario_empleado_raso) VALUES (8,'Rock al baño','2020/03/02','2020/03/02',1000006,2000000,1000004,1500000);
INSERT INTO evento(codigo,nombre,fecha_inicio,fecha_fin,directivo_asignado,salario_directivo,empleado_raso_asignado,salario_empleado_raso) VALUES (9,'Avengers day','2020/03/03','2020/03/03',1000007,2000000,1000005,1500000);



INSERT INTO agencia(codigo,nombre,pais,ano_creacion,correo_electronico,nombre_dueno) VALUES (101,'Model Professional','Colombia',1967,'modelprofessional@contacto.com','Alvaro Uribe');
INSERT INTO agencia(codigo,nombre,pais,ano_creacion,correo_electronico,nombre_dueno) VALUES (202,'Top Models','Estados unidos',1990,'Topmodels@contacto.com','Donald Trump');
INSERT INTO agencia(codigo,nombre,pais,ano_creacion,correo_electronico,nombre_dueno) VALUES (303,'Slim Models','Mexico',1984,'CarlosSlimmodels@contacto.com','Carlos Slim');


INSERT INTO portafolio(numero_portafolio,foto,objetivo,ano_creacion) VALUES (1,1,'Bodas',1998);
INSERT INTO portafolio(numero_portafolio,foto,objetivo,ano_creacion) VALUES (2,3,'Trajes debaño',2001);
INSERT INTO portafolio(numero_portafolio,foto,objetivo,ano_creacion) VALUES (3,3,'Vestimenta casual',2012);
INSERT INTO portafolio(numero_portafolio,foto,objetivo,ano_creacion) VALUES (4,4,'Bodas',2018);
INSERT INTO portafolio(numero_portafolio,foto,objetivo,ano_creacion) VALUES (5,5,'Trajes debaño',2019);


INSERT INTO modelo(pasaporte,pais,nombre,fecha_nacimiento,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_de_presentacion) VALUES (145678456,'Colombia','Natalia Perez','1995/08/17','verde','Blanca',170,60,80,39,57,NULL,101,1);
INSERT INTO modelo(pasaporte,pais,nombre,fecha_nacimiento,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_de_presentacion) VALUES (675876473,'Peru','Catalina Rodriguez','1990/08/18','cafe','Morena',180,65,84,38,60,'Manchas blancas brazo izquierdo',202,2);
INSERT INTO modelo(pasaporte,pais,nombre,fecha_nacimiento,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_de_presentacion) VALUES (1206074490,'Venezuela','Camila Prieto','1993/09/17','cafe','Blanca',167,60,82,37,62,NULL,303,3);
INSERT INTO modelo(pasaporte,pais,nombre,fecha_nacimiento,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_de_presentacion) VALUES (1736272507,'Brasil','Sandra Ordoñez','1995/08/24','azul','Morena',170,65,83,39,58,'cabello blanco natural',101,4);
INSERT INTO modelo(pasaporte,pais,nombre,fecha_nacimiento,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_de_presentacion) VALUES (2266470524,'Colombia','Mariana Morales','1995/10/13','cafe','Blanca',180,60,80,38,57,'cicatriz recorre el controno del ojo',303,5);


INSERT INTO historico_modelo(id_historico,pasaporte,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,fecha_actualizacion) VALUES (1,145678456,'verde','Blanca',170,65,78,39,58,'2015/08/28');
INSERT INTO historico_modelo(id_historico,pasaporte,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,fecha_actualizacion) VALUES (2,675876473,'cafe','Morena',180,60,84,39,57,'2021/12/02');
INSERT INTO historico_modelo(id_historico,pasaporte,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,fecha_actualizacion) VALUES (3,1206074490,'cafe','Blanca (Bronceado)',167,60,82,37,60,'2017/04/24');
INSERT INTO historico_modelo(id_historico,pasaporte,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,fecha_actualizacion) VALUES (4,1736272507,'azul','Morena',170,60,83,39,58,'1988/04/16');
INSERT INTO historico_modelo(id_historico,pasaporte,color_ojos,color_piel,estatura,cintura,busto,talla_zapatos,peso,fecha_actualizacion) VALUES (5,2266470524,'cafe','Blanca (Bronceado)',180,65,80,39,56,'2009/09/17');

INSERT INTO disenador(pasaporte,nombre,pais_origen) VALUES (3760563509,'Ricardo marquez','Colombia');
INSERT INTO disenador(pasaporte,nombre,pais_origen) VALUES (2345325783,'Andrea Franco','España');
INSERT INTO disenador(pasaporte,nombre,pais_origen) VALUES (3248769870,'Benito Martinez','Puerto Rico');



INSERT INTO banda(id_banda,nombre_banda,fecha_creacion,miembro1,miembro2,miembro3,miembro4) VALUES (2,'Aventura','1995/05/12','Lenny Santos','Max Santos',NULL,NULL);
INSERT INTO banda(id_banda,nombre_banda,fecha_creacion,miembro1,miembro2,miembro3,miembro4) VALUES (1,'Twenty One Pilots','2009/10/27','Josh Dun',NULL,NULL,NULL);



INSERT INTO artista(codigo,nombre_artistico,genero_musical,solista_grupal,contrato_auxiliar,es_banda,banda) VALUES (1,'Diomedez Diaz','Vallenato','solista','contrato','FALSE',NULL);
INSERT INTO artista(codigo,nombre_artistico,genero_musical,solista_grupal,contrato_auxiliar,es_banda,banda) VALUES (2,'Bad Bunny','Regaeton','solista','contrato','FALSE',NULL);
INSERT INTO artista(codigo,nombre_artistico,genero_musical,solista_grupal,contrato_auxiliar,es_banda,banda) VALUES (3,'Juanes','Rock','solista','contrato','FALSE',NULL);
INSERT INTO artista(codigo,nombre_artistico,genero_musical,solista_grupal,contrato_auxiliar,es_banda,banda) VALUES (4,'JBalvin','Regaeton','solista','contrato','FALSE',NULL);
INSERT INTO artista(codigo,nombre_artistico,genero_musical,solista_grupal,contrato_auxiliar,es_banda,banda) VALUES (5,'Tyler Joshep','Alternativo','grupal','contrato','TRUE',1);
INSERT INTO artista(codigo,nombre_artistico,genero_musical,solista_grupal,contrato_auxiliar,es_banda,banda) VALUES (6,'Romeo Santos','Bachata','grupal','contrato','TRUE',2);



INSERT INTO pabellon(nombre,empleado_responsable,telefono) VALUES ('Pabellon Roberto Gomez',1000001,3019080);
INSERT INTO pabellon(nombre,empleado_responsable,telefono) VALUES ('Pabellon Julio Jaramillo',1000002,2134567);
INSERT INTO pabellon(nombre,empleado_responsable,telefono) VALUES ('Pabellon Rosas',1000003,3124567);
INSERT INTO pabellon(nombre,empleado_responsable,telefono) VALUES ('Pabellon Simon Bolivar',1000004,8312345);
INSERT INTO pabellon(nombre,empleado_responsable,telefono) VALUES ('Pabellon Girasoles',1000005,9036523);
INSERT INTO pabellon(nombre,empleado_responsable,telefono) VALUES ('Pabellon Loto',1000006,1027856);
INSERT INTO pabellon(nombre,empleado_responsable,telefono) VALUES ('Pabellon Rosas Rojas',1000007,1983456);
INSERT INTO pabellon(nombre,empleado_responsable,telefono) VALUES ('Pabellon Luz de luna',1000008,1906183);
INSERT INTO pabellon(nombre,empleado_responsable,telefono) VALUES ('Pabellon El Gran Pabellon',1000009,8110872);



INSERT INTO desfile(numero,fecha,hora,nombre_coleccion,disenador,pabellon,modelo,salario_modelo,artista,salario_artista,evento_asignado) VALUES (1,'2021/08/26','6:00','primavera incio',3760563509,'Pabellon Roberto Gomez',145678456,2500000,1,3000000,1);
INSERT INTO desfile(numero,fecha,hora,nombre_coleccion,disenador,pabellon,modelo,salario_modelo,artista,salario_artista,evento_asignado) VALUES (2,'2021/08/27','12:00','primavera amanecer',2345325783,'Pabellon Julio Jaramillo',675876473,2700000,2,3000000,2);
INSERT INTO desfile(numero,fecha,hora,nombre_coleccion,disenador,pabellon,modelo,salario_modelo,artista,salario_artista,evento_asignado) VALUES (3,'2021/08/28','18:00','primavera el amor',3248769870,'Pabellon Rosas',1206074490,2800000,3,3000000,3);
INSERT INTO desfile(numero,fecha,hora,nombre_coleccion,disenador,pabellon,modelo,salario_modelo,artista,salario_artista,evento_asignado) VALUES (4,'2015/05/12','6:00','otoño inicio',3760563509,'Pabellon Simon Bolivar',1736272507,2500000,4,3000000,4);
INSERT INTO desfile(numero,fecha,hora,nombre_coleccion,disenador,pabellon,modelo,salario_modelo,artista,salario_artista,evento_asignado) VALUES (5,'2015/05/13','12:00','otoño amanecer',2345325783,'Pabellon Girasoles',2266470524,2700000,5,3000000,5);