

create table producto(id integer primary key
 auto_increment,
nombre varchar(30), 
precio float);


select * from producto;

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  rapid
 * Created: 11/06/2016
 */

create table user2(id integer primary key auto_increment, email varchar(80), name varchar(80));

CREATE TABLE mensaje(id INTEGER PRIMARY KEY AUTO_INCREMENT, titulo VARCHAR(80), cuerpo VARCHAR(200));

select * from user2;
select * from mensaje;

--cremos la tabla departamento que existe sin que existan empleados
create table departamento(id integer primary key auto_increment, nombre varchar(40));

create table empleado_x(id integer primary key auto_increment,
 id_departamento integer,
nombre varchar(80), foreign key(id_departamento) references departamento(id));

select * from departamento;
select * from empleado_x;


