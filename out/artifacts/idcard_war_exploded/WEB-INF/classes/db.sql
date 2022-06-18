net start mysql80

create database idcard;

use idcard;

create table usertable
(
id int(11) primary key not null auto_increment,
uname varchar(50) not null unique,
upwd varchar(32) not null
);

create table cardtable
(
id int(11) primary key not null auto_increment,
name varchar(50) not null,
telephone varchar(20) not null,
email varchar(50),
company varchar(50),
post varchar(50),
address varchar(50),
logoName varchar(30),
user_id int(11) not null references usertable(id)
);
