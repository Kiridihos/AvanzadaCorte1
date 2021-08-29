CREATE TABLE EVENTO(
  Codigo                         INTEGER  NOT NULL PRIMARY KEY, 
  nombre                         VARCHAR(10) NOT NULL,
  desfiles                       INTEGER  NOT NULL,
  fecha_incio                    DATE  NOT NULL,
  fecha_fin                      DATE  NOT NULL,
  directivo_asignadocarnet       INTEGER  NOT NULL,
  salario_directivo              INTEGER  NOT NULL,
  empleado_raso_asignados_carnet INTEGER  NOT NULL,
  salarios_empleado_raso         INTEGER  NOT NULL);

INSERT INTO EVENTO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (0,'primavera',1,'26-08-2021','26-08-2021',1000002,2000000,1000001,1500000);
INSERT INTO EVENTO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (0,'primavera',2,'27-08-2021','27-08-2021',1000006,2000000,1000003,1500000);
INSERT INTO EVENTO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (0,'primavera',3,'28-08-2021','28-08-2021',1000007,2000000,1000004,1500000);
INSERT INTO EVENTO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (1,'otoño',4,'12-05-2015','12-05-2015',1000002,2000000,1000005,1500000);
INSERT INTO EVENTO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (1,'otoño',5,'13-05-2015','13-05-2015',1000006,2000000,1000008,1500000);
INSERT INTO EVENTO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (1,'otoño',6,'14-05-2015','14-05-2015',1000007,2000000,1000009,1500000);
INSERT INTO EVENTO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (2,'verano',7,'01-03-2020','01-03-2020',1000002,2000000,1000010,1500000);
INSERT INTO EVENTO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (2,'verano',8,'02-03-2020','02-03-2020',1000006,2000000,1000004,1500000);
INSERT INTO EVENTO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (2,'verano',9,'03-03-2020','03-03-2020',1000007,2000000,1000005,1500000);
