drop table if exists tbl_user;

create table tbl_user(id int primary key auto_increment,name varchar(32),phoneNo varchar(16), email varchar(32));

insert into tbl_user(name, phoneNo, email) values ('dave', '13012345678', 'dave@tomoyadeng.com');