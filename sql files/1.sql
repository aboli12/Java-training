show databases;
create database cgi_db;
use cgi_db;
show tables;
create table product (
pid int,
pname varchar(20),
price float
);
insert into product values (1, 'TV', 40000);
select * from product;

create table login (emailid varchar(30) primary key, password varchar(30));