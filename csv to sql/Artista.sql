CREATE TABLE ARTISTA(
  nombre             VARCHAR(18) NOT NULL PRIMARY KEY,
  pais               VARCHAR(14) NOT NULL,
  codigo             INTEGER  NOT NULL,
  año_creacion       INTEGER  NOT NULL,
  correo_electronico VARCHAR(30) NOT NULL,
  nombre_dueño       VARCHAR(12) NOT NULL);

INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('1','Diomedez Diaz',Vallenato,solista,'contrato',NULL);
INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('2','Bad Bunny',Regaeton,solista,'contrato',NULL);
INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('3','Juanes',Rock,solista,'contrato',NULL);
INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('4','JBalvin',Regaeton,solista,'contrato',NULL);
INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('5','Tyler Joshep',Alternativo,grupal,'contrato','Twenty One Pilots');
INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('5','Josh Dun',Alternativo,grupal,'auxiliar','Twenty One Pilots');
INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('6','Romeo Santos',Bachata,grupal,'contrato','Aventura');
INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('6','Lenny',Bachata,grupal,'auxiliar','Aventura');
INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('6','Max',Bachata,grupal,'auxiliar','Aventura');
INSERT INTO ARTISTA(nombre,pais,codigo,año_creacion,correo_electronico,nombre_dueño) VALUES ('6','Romeo Santos',Bachata,solista,'contrato',NULL);
