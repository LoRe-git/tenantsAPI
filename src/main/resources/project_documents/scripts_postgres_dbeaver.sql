drop table if exists branch;
drop table if exists hostel;
drop table if exists login;
drop table if exists room;
drop table if exists tenant;


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
	hid varchar(255) notnull,
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
    

ALTER TABLE public.login ADD CONSTRAINT login_hostel_fk FOREIGN KEY (hid) REFERENCES public.hostel(hid);
ALTER TABLE public.room ADD CONSTRAINT room_room_fk FOREIGN KEY (rid) REFERENCES public.room(rid);
ALTER TABLE public.room ADD CONSTRAINT room_branch_fk FOREIGN KEY (bid) REFERENCES public.branch(bid);
ALTER TABLE public.branch ADD CONSTRAINT branch_hostel_fk FOREIGN KEY (hid) REFERENCES public.hostel(hid);
ALTER TABLE public.tenant ADD CONSTRAINT tenant_branch_fk FOREIGN KEY (bid) REFERENCES public.branch(bid);
ALTER TABLE public.tenant ADD CONSTRAINT tenant_room_fk FOREIGN KEY (room) REFERENCES public.room(rid);


INSERT INTO hostel(hid, blocks,hname ) VALUES ('pmh',3,'Posham Mens Hostel'),('tmh',1, 'Tirumala Mens Hostel');
INSERT INTO branch (bname, bid, hid, rooms) VALUES ('b1','pmhb1','pmh',1),('b2','pmhb2','pmh',3),('b3','pmhb3','pmh',2),('b1','tmhb1','tmh',5);
INSERT INTO login (uid, pwd, hid) values ('kanthreddy@gmail.com', 'kanthreddy', 'pmh'), ('lokireddy@gmail.com', 'lokireddy', 'tmh');
INSERT INTO room (rno, rid, bid, cost, capacity) values ('507', 'pmhb2_507', 'pmhb2', 5500, 4), ('508', 'pmhb2_508', 'pmhb2', 6000, 3), ('509', 'pmhb2_509', 'pmhb2', 7500, 2), ('508', 'tmhb1_508', 'tmhb1', 6000, 3);
INSERT INTO tenant (name, mobile, id, doj, address, room, amount, bid, email) values ('lokireddy', '7799885251', '123456789', '2015-02-01', 'hyd', 'tmhb1_508', 6000, 'pmhb2', NULL);


--select * from tenant;
--select * from hostel;
--select * from branch;
--select * from login;
--select * from room;


