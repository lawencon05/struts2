create table tb_m_roles (
	id serial,
	role_code varchar(10),
	role_name varchar(20)
);

alter table tb_m_roles add constraint role_pk primary key(id);

create table tb_m_users (
	id serial,
	username varchar(15),
	pass varchar(20),
	role_id bigint
);

alter table tb_m_users add constraint user_pk primary key(id);
alter table tb_m_users add constraint role_fk foreign key(role_id) references tb_m_roles(id);

insert into tb_m_roles (role_code, role_name) values 
('ADM', 'Admin'),
('HR', 'Human Resource');

insert into tb_m_users (username, pass, role_id) values 
('admin', 'admin123', 1),
('hr', 'hr123', 2);


