drop table booking;

drop table dependent;

drop table blood_bank;

drop table room;

drop table appointment;

drop table patient;

drop table doctor;

drop table department;

create table department(
dno number(3) primary key,
dept_name varchar(20),
dept_head number(4));

create table patient(
pid number(4) primary key,
pat_name varchar(20) not null,
dob date,
gender varchar(1) not null,
email varchar(20),
phno number(10) not null,
address varchar(20),
blood_group varchar(5) not null,
check (gender in ('M', 'F', 'm', 'f','O','o'))
);

create table doctor(
did number(4) primary key,
dno number(3) references department,
doc_name varchar(20),
address varchar(15),
email varchar(20),
gender varchar(1) not null,
phone number(10),
check (gender in ('M', 'F', 'm', 'f','O','o'))
);

create table appointment(
pid number(4) references patient,
did number(4) references doctor,
ap_date date,
primary key(pid,did,ap_date));

create table room(
rno number(4) primary key,
type varchar(10),
floor number(2)
);

create table blood_bank(
pid number(4) references patient,
bd_day timestamp,
blood_group varchar(3),
amount number(4),
primary key(pid,bd_day)
);

create table dependent(
pid number(4) primary key references patient,
dep_name varchar(20) not null,
gender varchar(1) not null,
relation varchar(10),
check (gender in ('M', 'F', 'm', 'f','O','o'))
);

create table booking( 
pid number(4) references patient,
rno number(4) references room,
in_date date,
out_date date,
primary key(pid,rno));
