create database QuanLySinhVien
go 
use QuanLySinhVien
go
create table Student
(
	id int IDENTITY(1,1)  NOT NULL primary key,
    name nvarchar(100) ,
	age int ,
)
create table Class
(
	id int IDENTITY(1,1)  NOT NULL primary key,
	class_name nvarchar(100),
)
create table DayOff
(
	id int IDENTITY(1,1)  NOT NULL primary key,
    student_id varchar(11) ,
	day_off date,
)