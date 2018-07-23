drop table if exists t_male_health;
drop table if exists t_female_health;
drop table if exists t_role;
drop table if exists t_user;
drop table if exists t_user_info;
drop table if exists t_user_role;

/* ========================= */
/* Table: t_male_health */
/* ========================= */
create table t_male_health
(
	id				int(12) not null auto increment,
	user_id			int(12) not null,
	heart			varchar(64) not null,
	liver			varchar(64) not null,
	spleen			varchar(64) not null,
	lung			varchar(64) not null,
	kidney			varchar(64) not null,
	prostate		varchar(64) not null,
	check_date		date not null,
	note			varchar(512),
	primary key		(id)
);

/* ========================= */
/* Table: t_female_health */
/* ========================= */
create table t_male_health
(
	id				int(12) not null auto increment,
	user_id			int(12) not null,
	heart			varchar(64) not null,
	liver			varchar(64) not null,
	spleen			varchar(64) not null,
	lung			varchar(64) not null,
	kidney			varchar(64) not null,
	uterus			varchar(64) not null,
	check_date		date not null,
	note			varchar(512),
	primary key		(id)
);

/* ========================= */
/* Table: t_role */
/* ========================= */
create table t_role
(
	id				int(12) not null auto increment,
	role_name		varchar(60) not null,
	note			varchar(512),
	primary key		(id)
);

/* ========================= */
/* Table: t_user */
/* ========================= */
create table t_user
(
	id				int(12) not null,
	user_name		varchar(60) not null,
	password		varchar(60) not null,
	sex				char(1) not null,
	mobile			varchar(20) not null,
	tel				varchar(20),
	email			varchar(60),
	note			varchar(512),
	primary key		(id)
);

/* ========================= */
/* Table: t_user_info */
/* ========================= */
create table t_user_info
(
	id				int(12) not null,
	user_id			int(12) not null,
	head_image		blob not null,
	note			varchar(1024),
	primary key		(id)
);

/* ========================= */
/* Table: t_user_role */
/* ========================= */
create table t_user_role
(
	id				int(12) not null auto increment,
	role_id			int(12) not null,
	user_id			int(12) not null,
	primary key 	(id)
);

/* ========================= */
/* Index: role_user_idx */
/* ========================= */
create unique index role_user_idx on t_user_role
(
	user_id,
	role_id
);










