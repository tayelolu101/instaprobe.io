 create database chateMe;
 create table user
 (username varchar(50) primary key,
 fullname varchar(100),
 password varchar(500)
 );

create procedure sp_addUser(uname varchar(50),fname varchar(100),pwd varchar(50))
insert into user values(uname,fname,sha(pwd));
create procedure sp_authUser(uname varchar(50),pwd varchar(50))
select * from user where username=uname and password=sha(pwd);
create procedure sp_getUser(uname varchar(50))
select * from user where username=uname;

create table onlineusers
(username varchar (50) primary key
CREATE PROCEDURE `sp_logout`(IN `uname` VARCHAR(50))
delete from onlineusers where username = uname;
CREATE PROCEDURE `sp_login`(IN `uname` VARCHAR(50)) 
insert into onlineusers values(uname);