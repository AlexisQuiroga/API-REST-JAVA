CREATE TABLE EMPRESA(id bigint NOT NULL IDENTITY, nombre varchar(150) NOT NULL, rubro VARCHAR(150) NOT NULL, PRIMARY KEY (id));

insert into EMPRESA(nombre, rubro) values('IngeNova', 'Electricidad');