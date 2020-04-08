DROP DATABASE product;
create database product;
use product;

create table product(
product_id int(11) NOT NULL AUTO_INCREMENT,
product_name varchar(25) DEFAULT NULL,
category varchar(25) DEFAULT NULL,
price numeric(7,2) DEFAULT NULL,
dateOfManufacture date,
dateOfExpiry date,
PRIMARY KEY (product_id)

);
INSERT INTO product VALUES(4,'GAMING LAPTOP','Electrinics',75000,'2020-01-02','2020-06-02');
INSERT INTO product VALUES(5,'star war toy','Electrinics',75000,'2020-01-02','2020-06-02');
INSERT INTO product VALUES(6,'dark fantasy','Grocery',75000,'2020-01-02','2020-06-02');
INSERT INTO product VALUES(7,'i phone','Electrinics',75000,'2020-01-02','2020-06-02');
INSERT INTO product VALUES(8,'one plus 8','Electrinics',75000,'2020-01-02','2020-06-02');



create table login(
uname varchar(20),
pass varchar(20));

insert into login values('nsrt','Nsrt@123');

select * from product;
select * from login;