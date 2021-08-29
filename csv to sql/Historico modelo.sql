CREATE TABLE HISTORICO_MODELO(
  Codigo                         INTEGER  NOT NULL PRIMARY KEY, 
  nombre                         VARCHAR(10) NOT NULL,
  desfiles                       INTEGER  NOT NULL,
  fecha_incio                    DATE  NOT NULL,
  fecha_fin                      DATE  NOT NULL,
  directivo_asignadocarnet       INTEGER  NOT NULL,
  salario_directivo              INTEGER  NOT NULL,
  empleado_raso_asignados_carnet INTEGER  NOT NULL,
  salarios_empleado_raso         INTEGER  NOT NULL);

INSERT INTO HISTORICO_MODELO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (145678456,'verde',Blanca,'170','65',78,39,58,2015);
INSERT INTO HISTORICO_MODELO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (675876473,'cafe',Morena,'180','60',84,39,57,2021);
INSERT INTO HISTORICO_MODELO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (1206074490,'cafe',Blanca (Bronceado),'167','60',82,37,60,2017);
INSERT INTO HISTORICO_MODELO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (1736272507,'azul',Morena,'170','60',83,39,58,1988);
INSERT INTO HISTORICO_MODELO(Codigo,nombre,desfiles,fecha_incio,fecha_fin,directivo_asignadocarnet,salario_directivo,empleado_raso_asignados_carnet,salarios_empleado_raso) VALUES (2266470524,'cafe',Blanca (Bronceado),'180','65',80,39,56,2009);
