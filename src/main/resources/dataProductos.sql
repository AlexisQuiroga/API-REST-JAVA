CREATE TABLE PRODUCTOS(id bigint NOT NULL IDENTITY, nombre varchar(150) NOT NULL, descripcion VARCHAR(150) NOT NULL, precio FLOAT NOT NULL, cantidad_de_stock INT NOT NULL, PRIMARY KEY (id));


insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Amperimetro', 'Instrumento medidor de intensidad electrica en Amperes', 2580, 55);

insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Voltimetro', 'Instrumento medidor de tension electrica en Voltios', 3250, 20);

insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Multimetro', 'Instrumento que permite medir tanto tension como corriente electrica y potencia', 5950, 42);

insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Pinza Ampereometrica', 'Instrumento de medicion para calcular consumos', 6580, 9);

insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Set destornilladores AT', 'Set de destornilladores de alta tension(AT) Soportan hasta 1000V', 2790.65, 78);

insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Set llaves allem', 'Juego de llaves Allem de 5mm a 22mm', 890, 15);

insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Pinza', 'Pinza convencional de uso regular', 820, 90);

insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Alicate', 'Alicate corta cables, resistente a altas tensiones', 900, 25);

insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Pela cable', 'Pinza pelacable, con regulacion para cortes', 950, 56);

insert into PRODUCTOS(nombre, descripcion, precio, cantidad_de_stock) values('Llave francesa', 'Llave francesa o Pulsiana de regurlacion simple de 6 a 25mm', 1980, 59);


