set autocommit on;
drop table contract;
drop table hires;
drop table works;
drop table Companies;
drop table employee;
drop table dep;

create table Dep(Dept_ID varchar2(5) primary key,
	Dept_name varchar2(15) not null,
	No_emp number check(No_emp>0),
	No_avl number,Sal real);
create table employee(
	ID varchar2(5) primary key,
	Name varchar2(25) not null,
	Email varchar2(20),
	Ph_No varchar2(25) not null,
	Address varchar2(25),
	H_deg varchar2(15),
	DOB date,
	Dept_ID varchar2(15),skill varchar2(30),
	avl char(1) check (avl in ('Y','N')),
	foreign key (Dept_id) references Dep (Dept_ID) on delete cascade);

create table Companies(Comp_ID varchar2(5),
	branch_id varchar2(5),
	Comp_Name varchar2(15),
	Sector varchar2(15),
	Address varchar2(25),
	Manager varchar2(20) not null,
	primary key(Comp_ID,branch_id));

create table Hires(Comp_ID varchar2(5),
	Branch_id varchar2(5),
	Dept_ID varchar2(5) references Dep(Dept_ID),
	No_emp number,
	Start_date date,
	End_date date,
	foreign key (Comp_ID, Branch_id) references Companies);

create table Works(Emp_ID varchar2(5) references employee(ID),
	Comp_id varchar2(5),
	Branch_id varchar2(5),
	Dept_id varchar2(15) references dep,
	foreign key (Comp_ID, Branch_id) references Companies);

create table Contract(Comp_ID varchar2(5),
	branch_id varchar2(5),
	Contract_start date,
	Contract_end date,
	Fee real,
	foreign key (Comp_ID, branch_id) references Companies);	



insert into Dep values('001','IT',5,5,20000);
insert into Dep values('002','Research',5,5,30000);
insert into Dep values('003','Finance',5,5,30000);
insert into Dep values('004','Marketing',1,1,25000);
insert into Dep values('005','HR',1,1,40000);
insert into Dep values('006','Purchasing',1,1,40000);
insert into Dep values('007','Publicity',1,1,45000);	
insert into Dep values('008','Legal',1,1,40000);

insert into employee values('1','Swetha','sswetha08@gmail.com','9663962608','BANGALORE','B.Tech','23-Nov-1998','001','Web Dev','Y');
insert into employee values('2','Francesca','francesca@gmail.com','9661112608','KOLKATA','M.Sc','23-DEC-1990','001','App Dev','Y');
insert into employee values('3','Garnett','Garnett@gmail.com','7639600928','BANGALORE','B.Tech','05-SEP-1998','001','AI','Y');
insert into employee values('4','Henry','Henry@gmail.com','9677762608','DELHI','M.Sc','01-Nov-1998','001','ML','Y');
insert into employee values('5','Althea','Althea@gmail.com','9610101608','RAJASTHAN','B.Tech','20-jan-1989','001','CryptoCurrency','Y');

insert into employee values('6','Srinidhi','ssrini03@gmail.com','9512962608','BANGALORE','MBA','06-Nov-2003','003','Accounts','Y');
insert into employee values('7','Barbara','Barbara@gmail.com','95539122','RAJASTHAN','BBA','06-Nov-2003','003','Reports','Y');
insert into employee values('8','Sebastian','Sebastian@gmail.com','95531118','CHENNAI','MBA','06-Nov-2003','003','Reports','Y');
insert into employee values('9','Merilyn','Merilyn@gmail.com','9553233028','MUMBAI','BBA','06-Nov-2003','003','Budget','Y');
insert into employee values('10','Anastasia','Anastasia@gmail.com','9553962111','MANGALORE','MBA','06-Nov-2003','003','Stocks','Y');

insert into employee values('11','Aditya','aditya@gmail.com','6763342608','DELHI','B.Tech','15-Dec-1995','002','Neural Networks','Y');
insert into employee values('12','Paul','aditya@gmail.com','7963342608','AHEMDABAD','B.Tech','20-nov-1994','002','Deep Learning','Y');
insert into employee values('13','Jake','aditya@gmail.com','1163319908','DELHI','B.Tech','12-jul-1989','002','Supply Chain','Y');
insert into employee values('14','Byron','aditya@gmail.com','2263310108','MANGALORE','M.Sc','13-aug-1987','002','Neural Networks','Y');
insert into employee values('15','Logan','aditya@gmail.com','996312608','GOA','M.Sc','01-sep-1991','002','Automation','Y');

insert into employee values('16','Sri','ssri08@gmail.com','9663962007','CHENNAI','MBA','23-Nov-1998','005','Training','Y');
insert into employee values('17','Rishi','rishic@gmail.com','8233962608','CHENNAI','IT','14-Jun-2002','006','App Dev','Y');
insert into employee values('18','Shivani','shivani@gmail.com','9663968934','HYDERABAD','BBA','20-Oct-2000','004','Advertising','Y');
insert into employee values('19','Aayushi','aayushi@gmail.com','9900150745','DELHI','BTech','20-Feb-1999','008','Fraud cases','Y');
insert into employee values('20','Siddharth','sid@hotmail.com','89923293','KERALA','B.Tech','20-JUN-1990','007','Graphic Designer','Y');


insert into companies values('001','B1','Intel','IT','BANGALORE','Roshni');
insert into companies values('001','B2','Intel','IT','DELHI','Ashish');
insert into companies values('002','B1','BI Corp','Marketing','HYDERABAD','Reddy');
insert into companies values('003','B1','Spark Research','Research','BANGALORE','Trisha');
insert into companies values('004','B1','Microsoft','IT','CHENNAI','Karthik');


insert into contract values('001','B1','12-Jun-2017','12-Oct-2017',2000000);
insert into contract values('001','B2','13-Aug-2017','25-Dec-2017',4000000);
insert into contract values('002','B1','17-Sep-2018','19-Dec-2018',200000);
insert into contract values('003','B1','19-Mar-2017','20-Nov-2018',9000000);
insert into contract values('004','B1','07-Jan-2018','12-May-2018',800000);








	
	