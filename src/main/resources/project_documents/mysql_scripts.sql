drop table if exists branch;
drop table if exists hostel;
drop table if exists login;
drop table if exists room;
drop table if exists tenant;
drop table if exists checklist;
drop table if exists expences;

create table hostel (
	hid varchar(255) not null,
	blocks varchar(255),
	hname varchar(255),
	primary key (hid)
);

create table tenant (
	id integer not null,
	address varchar(255),
	amount integer,
	bid varchar(255),
	doj date,
	email varchar(255),
	gov_id varchar(255),
	mobile varchar(255),
	name varchar(255),
	room varchar(255),
	primary key (id)
);
    
    
create table room (
	rid varchar(255) not null,
	bid varchar(255),
	capacity integer,
	cost integer,
	rno varchar(255),
	primary key (rid)
);
    
create table login (
	uid varchar(255) not null,
	hid varchar(255) not null,
	pwd varchar(255),
	primary key (uid)
);
    
create table branch (
	bid varchar(255) not null,
	bname varchar(255),
	hid varchar(255),
	rooms integer,
	primary key (bid)
);
    
create table checklist (
	checklist_id integer not null AUTO_INCREMENT,
	bid varchar(255) not null,
	checklist_date date,
	incharge_name varchar(255),
	opening_balance integer,
	admissions integer,
	vacancies integer,
	notice_periods integer,
	complaints varchar(255),
	collections_cash integer,
	collections_ac integer,
	collections_pending integer,
	closing_balance integer,
	water_tankers integer,
	misc varchar(255),
	PRIMARY KEY(checklist_id),
	foreign key (bid) REFERENCES branch(bid) 
);


create table expences (
	expences_id integer not null AUTO_INCREMENT,
	name varchar(255),
	description varchar(255),
	cost integer,
	checklist_id integer not null,
	PRIMARY key (expences_id),
	foreign key (checklist_id) REFERENCES checklist(checklist_id)
);


ALTER TABLE login ADD CONSTRAINT login_hostel_fk FOREIGN KEY (hid) REFERENCES hostel(hid);
--ALTER TABLE room ADD CONSTRAINT room_room_fk FOREIGN KEY (rid) REFERENCES room(rid);
ALTER TABLE room ADD CONSTRAINT room_branch_fk FOREIGN KEY (bid) REFERENCES branch(bid);
ALTER TABLE branch ADD CONSTRAINT branch_hostel_fk FOREIGN KEY (hid) REFERENCES hostel(hid);
ALTER TABLE tenant ADD CONSTRAINT tenant_branch_fk FOREIGN KEY (bid) REFERENCES branch(bid);
ALTER TABLE tenant ADD CONSTRAINT tenant_room_fk FOREIGN KEY (room) REFERENCES room(rid);


INSERT INTO hostel(hid, blocks,hname ) VALUES ('pmh',3,'Posham Mens Hostel'),('tmh',1, 'Tirumala Mens Hostel');
INSERT INTO branch (bname, bid, hid, rooms) VALUES ('b1','pmhb1','pmh',1),('b2','pmhb2','pmh',3),('b3','pmhb3','pmh',2),('b1','tmhb1','tmh',5);
INSERT INTO login (uid, pwd, hid) values ('kanthreddy@gmail.com', 'kanthreddy', 'pmh'), ('lokireddy@gmail.com', 'lokireddy', 'tmh');
INSERT INTO room (rno, rid, bid, cost, capacity) values ('507', 'pmhb2_507', 'pmhb2', 5500, 4), ('508', 'pmhb2_508', 'pmhb2', 6000, 3), ('509', 'pmhb2_509', 'pmhb2', 7500, 2), ('508', 'tmhb1_508', 'tmhb1', 6000, 3);
INSERT INTO tenant (name, mobile, id, doj, address, room, amount, bid, email) values ('lokireddy', '7799885251', '123456789', '2015-02-01', 'hyd', 'tmhb1_508', 6000, 'tmhb1', NULL), ('kanthreddy', '9092341464', '111122222', '2015-02-01', 'hyd', 'pmhb2_507', 6000, 'pmhb2', NULL);
INSERT INTO checklist (checklist_id,bid,checklist_date,incharge_name,opening_balance,admissions,vacancies,notice_periods,complaints,collections_cash,collections_ac,collections_pending,closing_balance,water_tankers,misc)
	VALUES (1,'pmhb2','2019-10-12','Loki',0,1,1,1,'none',10000,5000,0,25000,1,'none');
INSERT INTO expences (name,description,cost,checklist_id) VALUES ('repair','tap repair',2000,1);


SELECT * FROM login;
SELECT * FROM room;
SELECT * FROM branch;
SELECT * FROM hostel;
SELECT * FROM tenant;
SELECT * FROM checklist;
SELECT * FROM expences;



