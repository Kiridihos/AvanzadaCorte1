CREATE TABLE MODELOS(
  pasaporte               INTEGER  NOT NULL PRIMARY KEY, 
  pais                    VARCHAR(9) NOT NULL,
  nombre                  VARCHAR(18) NOT NULL,
  fecha_nacimiento        DATE  NOT NULL,
  Color_ojos              VARCHAR(5) NOT NULL,
  Color_piel              VARCHAR(6) NOT NULL,
  estatura                INTEGER  NOT NULL,
  cintura                 INTEGER  NOT NULL,
  busto                   INTEGER  NOT NULL,
  talla_zapatos           INTEGER  NOT NULL,
  peso                    INTEGER  NOT NULL,
  particularidades        VARCHAR(36),
  agencia                 INTEGER  NOT NULL,
  portafolio_presentacion INTEGER  NOT NULL);

INSERT INTO MODELOS(pasaporte,pais,nombre,fecha_nacimiento,Color_ojos,Color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_presentacion) VALUES (145678456,'Colombia','Natalia Perez','17/08/95','verde','Blanca',170,60,80,39,57,NULL,101,10);
INSERT INTO MODELOS(pasaporte,pais,nombre,fecha_nacimiento,Color_ojos,Color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_presentacion) VALUES (675876473,'Peru','Catalina Rodriguez','18/08/90','cafe','Morena',180,65,84,38,60,'Manchas blancas brazo izquierdo',202,20);
INSERT INTO MODELOS(pasaporte,pais,nombre,fecha_nacimiento,Color_ojos,Color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_presentacion) VALUES (1206074490,'Venezuela','Camila Prieto','17/09/93','cafe','Blanca',167,60,82,37,62,NULL,303,30);
INSERT INTO MODELOS(pasaporte,pais,nombre,fecha_nacimiento,Color_ojos,Color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_presentacion) VALUES (1736272507,'Brasil','Sandra Ordoñez','24/08/95','azul','Morena',170,65,83,39,58,'cabello blanco natural',101,40);
INSERT INTO MODELOS(pasaporte,pais,nombre,fecha_nacimiento,Color_ojos,Color_piel,estatura,cintura,busto,talla_zapatos,peso,particularidades,agencia,portafolio_presentacion) VALUES (2266470524,'Colombia','Mariana Morales','13/10/95','cafe','Blanca',180,60,80,38,57,'cicatriz recorre el controno del ojo',303,50);
