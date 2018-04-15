create database imobiliariadb;

use imobiliariadb;

create table usuario(

id bigint not null	auto_increment,
nome varchar(100) not null,
email varchar(100) null,
login varchar(30) not null,
senha varchar(30) not null,
primary key(id)
)

select * from usuario
