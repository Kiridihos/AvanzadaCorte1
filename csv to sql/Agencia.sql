CREATE TABLE AGENCIA(
   nombre             VARCHAR(18) NOT NULL PRIMARY KEY,
   pais               VARCHAR(14) NOT NULL,
   codigo             INTEGER  NOT NULL,
   año_creacion       INTEGER  NOT NULL,
   correo_electronico VARCHAR(30) NOT NULL,
   nombre_dueño       VARCHAR(12) NOT NULL);
INSERT INTO AGENCIA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('Model Professional','Colombia',101,1967,'modelprofessional@contacto.com','Alvaro Uribe');
INSERT INTO AGENCIA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('Top Models','Estados unidos',202,1990,'Topmodels@contacto.com','Donald Trump');
INSERT INTO AGENCIA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('Slim Models','Mexico',303,1984,'CarlosSlimmodels@contacto.com','Carlos Slim');
