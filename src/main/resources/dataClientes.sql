CREATE TABLE CLIENTES(id bigint NOT NULL IDENTITY, nombre varchar(150) NOT NULL, apellido VARCHAR(150) NOT NULL, dni INTEGER NOT NULL, direccion VARCHAR(150) NOT NULL, PRIMARY KEY (id));


insert into CLIENTES(nombre, apellido, dni, direccion) values('Jorge', 'Lopez', 32456652, 'Lopez y Planes 2548');
insert into CLIENTES(nombre, apellido, dni, direccion) values('Martin', 'Rodriguez', 15656548, 'Rivadavia 1580');
insert into CLIENTES(nombre, apellido, dni, direccion) values('Ramon', 'Ledesma', 25655688, 'W. Paunero 2453');
insert into CLIENTES(nombre, apellido, dni, direccion) values('Anibal', 'Troilo', 31236565, 'Alcorta 335');
insert into CLIENTES(nombre, apellido, dni, direccion) values('Carlos', 'Sainz', 40355624, 'Av. Sabatini 2500');
insert into CLIENTES(nombre, apellido, dni, direccion) values('Miguel', 'Balangero', 06565359, 'San Martin 1250');