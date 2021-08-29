CREATE TABLE DESFILES(
  numero          INTEGER  NOT NULL PRIMARY KEY, 
  fecha           DATE  NOT NULL,
  hora            VARCHAR(5) NOT NULL,
  nombre          VARCHAR(18) NOT NULL,
  diseñador       INTEGER  NOT NULL,
  pabellon        VARCHAR(25) NOT NULL,
  modelos         INTEGER  NOT NULL,
  salario_modelo  INTEGER  NOT NULL,
  artista         INTEGER  NOT NULL,
  salario_artista INTEGER  NOT NULL,
  prendas_modelo  VARCHAR(17) NOT NULL);
INSERT INTO DESFILES(numero,fecha,hora,nombre,diseñador,pabellon,modelos,salario_modelo,artista,salario_artista,prendas_modelo) VALUES (1,'26-08-2021','6:00','primavera incio',3760563509,'Pabelllon Roberto Gomez',145678456,2500000,1,3000000,'Bodas');
INSERT INTO DESFILES(numero,fecha,hora,nombre,diseñador,pabellon,modelos,salario_modelo,artista,salario_artista,prendas_modelo) VALUES (2,'27-08-2021','12:00','primavera amanecer',3760563509,'Pabellon Julio Jaramillo',675876473,2700000,2,3000000,'Trajes debaño');
INSERT INTO DESFILES(numero,fecha,hora,nombre,diseñador,pabellon,modelos,salario_modelo,artista,salario_artista,prendas_modelo) VALUES (3,'28-08-2021','18:00','primavera el amor',3760563509,'Pabellon Rosas',1206074490,2800000,3,3000000,'Vestimenta casual');
INSERT INTO DESFILES(numero,fecha,hora,nombre,diseñador,pabellon,modelos,salario_modelo,artista,salario_artista,prendas_modelo) VALUES (4,'12-05-2015','6:00','otoño inicio',2345325783,'Pabellon Simon Bolivar',1736272507,2500000,4,3000000,'Bodas');
INSERT INTO DESFILES(numero,fecha,hora,nombre,diseñador,pabellon,modelos,salario_modelo,artista,salario_artista,prendas_modelo) VALUES (5,'13-05-2015','12:00','otoño amanecer',2345325783,'Pabellon Girasoles',2266470524,2700000,5,3000000,'Trajes debaño');
INSERT INTO DESFILES(numero,fecha,hora,nombre,diseñador,pabellon,modelos,salario_modelo,artista,salario_artista,prendas_modelo) VALUES (6,'14-05-2015','18:00','otoño el amor',2345325783,'Pabellon Loto',145678456,2800000,1,3000000,'Vestimenta casual');
INSERT INTO DESFILES(numero,fecha,hora,nombre,diseñador,pabellon,modelos,salario_modelo,artista,salario_artista,prendas_modelo) VALUES (7,'01-03-2020','6:00','verano inicio',3248769870,'Pabellon Rosas Rojas',675876473,2500000,6,3000000,'Bodas');
INSERT INTO DESFILES(numero,fecha,hora,nombre,diseñador,pabellon,modelos,salario_modelo,artista,salario_artista,prendas_modelo) VALUES (8,'02-03-2020','12:00','verano amanecer',3248769870,'Pabellon Luz de luna',1206074490,2700000,2,3000000,'Trajes debaño');
INSERT INTO DESFILES(numero,fecha,hora,nombre,diseñador,pabellon,modelos,salario_modelo,artista,salario_artista,prendas_modelo) VALUES (9,'03-03-2020','18:00','verano el amor',3248769870,'Pabellon El Gran Pabellon',1736272507,2800000,6,3000000,'Vestimenta casual');
