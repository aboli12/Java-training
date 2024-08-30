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

insert into trainer values (1, 'Raj', 'Java');
insert into trainer values (2, 'Akash', 'python');

insert into student values (101,  19,'Pooja',1);
insert into student values (102, 20, 'Neeta',2);

select * from trainer;

select * from student;

desc student;


select * from employee;