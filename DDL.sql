drop trigger don_count;

drop table donations;

drop table booking;

drop table blood_bank;

drop table room;

drop table appointment;

drop table patient;

drop table doctor;

drop table department;

create table donations(donate number(5) primary key);

create table department(
dno number(3) primary key,
dept_name varchar(20) not null,
dept_head number(4) not null);

create table patient(
pid number(4) primary key,
pat_name varchar(20) not null,
dob date not null,
gender varchar(1) not null,
email varchar(20) not null,
phno number(10) not null,
address varchar(20) not null,
blood_group varchar(5) not null,
check (gender in ('M', 'F', 'm', 'f','O','o'))
);

create table doctor(
did number(4) primary key,
dno number(3) references department,
doc_name varchar(20) not null,
address varchar(15) not null,
email varchar(20) not null,
gender varchar(1) not null,
phone number(10) not null,
check (gender in ('M', 'F', 'm', 'f','O','o'))
);

create table appointment(
pid number(4) references patient,
did number(4) references doctor,
ap_date date not null,
primary key(pid,did,ap_date));

create table room(
rno number(4) primary key,
type varchar(10) not null,
floor number(2) not null
);

create table blood_bank(
pid number(4) references patient,
bd_day timestamp not null,
blood_group varchar(3) not null,
amount number(4) not null,
primary key(pid,bd_day)
);

create table booking( 
pid number(4) references patient,
rno number(4) references room,
in_date date not null,
out_date date not null,
primary key(pid,rno));

create or replace trigger don_count
before insert on blood_bank
for each row
begin 
	if :New.amount>0 then
		update donations set donate=donate+1;
	end if;
end;
/

drop procedure insert_bank;

create or replace procedure insert_bank(chk out number,pid1 blood_bank.pid%type,quan1 blood_bank.amount%type) is
	tot number;
	bg blood_bank.blood_group%type;
	insufficientBlood Exception;
begin
	select blood_group into bg from patient where pid=pid1;
	savepoint s1;
	insert into blood_bank values(pid1,systimestamp,bg,quan1);
	select sum(amount) into tot from blood_bank where blood_group=bg;
	if tot<0 then
		chk:=0;
		raise insufficientBlood;
	end if;
	chk:=1;
exception
	when insufficientBlood then
		rollback to s1;
end;
/
	 
