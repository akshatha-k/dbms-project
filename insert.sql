INSERT INTO Department VALUES(1,'General Medicine',3);
INSERT INTO Department VALUES(2,'Surgery',4);
INSERT INTO Department VALUES(3,'Psychiatry',8);
INSERT INTO Department VALUES(4,'Orthopaedics',11);
INSERT INTO Department VALUES(5,'Neurology',14);
INSERT INTO Department VALUES(6,'Cardiology',17);
INSERT INTO Department VALUES(7,'Gynaecology',19);

INSERT INTO Doctor values(1,1,'Ramesh','Manipal','BurksR@univ.edu','M',9532627342);
INSERT INTO Doctor values(2,1,'Damien','Manipal','AvilaD@univ.edu','M',1234567897);
INSERT INTO Doctor values(3,1,'Robin','Gabon','OlsenR@univ.edu','M',3455767432);
INSERT INTO Doctor values(4,2,'Edmund','Manipal','MoisesE@univ.edu','M',3445627342);
INSERT INTO Doctor values(5,2,'Burks','Manipal','BrianH@univ.edu','M',3434343434);
INSERT INTO Doctor values(6,2,'Avila','Fiji','ClaudeE@univ.edu','F',7867687858);
INSERT INTO Doctor values(7,2,'Moises','Manipal','MosleyE@univ.edu','M',1919293949);
INSERT INTO Doctor values(8,3,'Heath','Afghanistan','DerekA@univ.edu','M',2525252525);
INSERT INTO Doctor values(9,3,'Elvin','Albania','HawkinsC@univ.edu','M',1313131313);
INSERT INTO Doctor values(10,1,'Edmund','Manipal','PateA@univ.edu','M',1414141414);
INSERT INTO Doctor values(11,1,'Antoine','Algeria','AustinL@univ.edu','F',1515151515);
INSERT INTO Doctor values(12,1,'Derek','Andorra','KendrickR@univ.edu','M',1616161616);
INSERT INTO Doctor values(13,1,'Claude','Angola','SimsA@univ.edu','F',1717171717);
INSERT INTO Doctor values(14,1,'Haney','Belarus','MullinsK@univ.edu','F',1818181818);
INSERT INTO Doctor values(15,1,'Rosella','Bhutan','ChuckL@univ.edu','F',1919191919);
INSERT INTO Doctor values(16,1,'Mccoy','Botswana','PayneL@univ.edu','M',2121212121);
INSERT INTO Doctor values(17,1,'Hawkins','Bulgaria','BaxterJ@univ.edu','M',3131313131);
INSERT INTO Doctor values(18,1,'Pate','Croatia','WeissG@univ.edu','M',4141414141);
INSERT INTO Doctor values(19,1,'Andrea','Manipal','DeirdreF@univ.edu','F',5151515151);
INSERT INTO Doctor values(20,1,'Callie','Manipal','FernandoT@univ.edu','F',6161616161);
INSERT INTO Doctor values(21,1,'Reba','Manipal','GarrisonP@univ.edu','F',7171717171);

INSERT INTO Patient values(3130,'Pate','03-DEC-1989','M','KaufmanE@univ.edu',2121212121,'Manipal','O+');
INSERT INTO Patient values(1212,'Elba','13-FEB-1989','F','SparksE@univ.edu',1212121212,'Mangalore','A+');
INSERT INTO Patient values(3421,'Ezra','01-JAN-1979','F','PageW@univ.edu',3232323232,'Manipal','O+');
INSERT INTO Patient values(8962,'Winnie','08-DEC-1939','F','ShieldsR@univ.edu',4343434343,'Mangalore','O+');
INSERT INTO Patient values(1813,'Rich','17-NOV-1989','M','DunlapA@univ.edu',5454545454,'Udupi','AB+');
INSERT INTO Patient values(1890,'Sam','03-OCT-1999','M','QuentinS@univ.edu',6565656565,'Karkala','O+');
INSERT INTO Patient values(1814,'Jaime','13-DEC-1993','M','EvelynS@univ.edu',7676767676,'Manipal','O-');
INSERT INTO Patient values(1811,'Rohit','08-DEC-1992','M','EarlineJ@univ.edu',8787878787,'Karkala','B+');
INSERT INTO Patient values(7718,'Rohan','11-DEC-1972','M','BergerJ@univ.edu',9898989898,'Mangalore','O+');
INSERT INTO Patient values(3418,'Nithya','23-DEC-1984','F','WeissG@univ.edu',3434343434,'Manipal','O+');
INSERT INTO Patient values(2618,'Soumili','01-DEC-1991','F','HeadK@univ.edu',4545454545,'Udupi','A+');
INSERT INTO Patient values(9918,'Reeta','04-DEC-2002','F','GrantA@univ.edu',5656565656,'Mangalore','B+');
INSERT INTO Patient values(1118,'Spandy','24-DEC-1989','F','KatherynR@univ.edu',6767676767,'Manipal','O+');
INSERT INTO Patient values(1238,'Abhi','03-DEC-1989','M','BradyN@univ.edu',7878787878,'Udupi','B-');
INSERT INTO Patient values(1448,'Jeet','31-DEC-2012','M','MichaelD@univ.edu',8989898989,'Karkala','A+');

insert into Appointment values(1814,2,'12-MAR-2019');
insert into Appointment values(2618,20,'12-APR-2019');
insert into Appointment values(1238,12,'01-MAY-2019');
insert into Appointment values(1448,3,'11-MAR-2019');
insert into Appointment values(1890,4,'12-MAR-2019');

insert into room values(101,'Single',1);
insert into room values(102,'Single',1);
insert into room values(103,'Single',1);
insert into room values(104,'Single',1);
insert into room values(105,'Single',1);
insert into room values(106,'Single',1);
insert into room values(201,'Double',2);
insert into room values(202,'Double',2);
insert into room values(203,'Double',2);
insert into room values(204,'Double',2);
insert into room values(301,'General',3);
insert into room values(302,'General',3);

insert into blood_bank values(1118,'21-JAN-2017 12:34:56.78','O+',200);
insert into blood_bank values(1238,'25-JAN-2017 11:34:56.78','O+',250);

insert into booking values(9918,103,'11-APR-2019','12-APR-2019');
insert into booking values(3418,106,'11-APR-2019','12-APR-2019');

insert into dependent values(7718,'Nithya','F','sister');
insert into dependent values(2618,'Abhijeet','M','friend');
