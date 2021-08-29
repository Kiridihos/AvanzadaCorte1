CREATE TABLE EMPLEADO(
  carnet               INTEGER  NOT NULL PRIMARY KEY,
  Tipo_empleado        VARCHAR(9) NOT NULL,
  nombre               VARCHAR(15) NOT NULL,
  profesionales        VARCHAR(17),
  universidad_egresada VARCHAR(30),
  celular              INTEGER  NOT NULL);

INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000001,'raso','Jose Garzon',NULL,'-',3122748675);
INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000002,'directivo','Felipe Perez','ing. sistemas','Universidad Jorge Tadeo Lozano',3134137898);
INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000003,'raso','Camilo Carrera',NULL,NULL,3158976543);
INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000004,'raso','Sandra Bonel',NULL,NULL,3058888216);
INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000005,'raso','Daniel Rueda',NULL,NULL,3058865632);
INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000006,'directivo','Martha Martinez','Arquitecto','Universidad de los andes',3013125467);
INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000007,'directivo','Lucia Layton','Diseñador grafico','Universidad nacional',3103128040);
INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000008,'raso','Jorge Mendez',NULL,NULL,3123207687);
INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000009,'raso','Wilson Caceres',NULL,NULL,3156783454);
INSERT INTO EMPLEADO(carnet,Tipo_empleado,nombre,profesionales,universidad_egresada,celular) VALUES (1000010,'raso','Andres Luque',NULL,NULL,3057652131);
