DROP DATABASE IF EXISTS defaultdb;

create database defaultdb;

use defaultdb;

create table Course(
     course_code varchar(30) primary key,
     title_description varchar(230),
     capacity varchar(20),
     scheduled varchar(30)
);
insert into course values('C01','This course is free of cost','C1','Available');
insert into course values('C02','This course is free of cost','C2','Available');
insert into course values('C03','This course is free of cost','C3','Not Available');
insert into course values('C04','This course is free of cost','C4','Not Available');

select course_code from course where scheduled = 'Available';

create table Student(
  studentId int primary key,
  name varchar(50),
  course_code varchar(30),
  FOREIGN KEY (course_code) REFERENCES Course(course_code)
);

insert into student values(101,'Manju','C01');
insert into student values(102,'Manju','C02');
insert into student values(103,'Aarthi','C02');
insert into student values(104,'Nikki','C01');

select * from student;
