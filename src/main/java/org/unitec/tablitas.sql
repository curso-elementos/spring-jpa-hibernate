

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
drop table persona;
drop table direccion;
create table persona (id Integer primary key auto_increment, nombre varchar(30));
create table direccion(id_direccion  integer primary key auto_increment, id integer,municipio varchar(40), 
foreign key(id) references persona(id) );
