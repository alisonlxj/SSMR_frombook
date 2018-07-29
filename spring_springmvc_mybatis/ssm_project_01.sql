drop table if exists user01;


/*==========================*/
/* 创建springmvc01的表结构 */
/*==========================*/
create table user01
(
	id				int(12) not null,
	name			varchar(100) not null,
	password		varchar(100) not null,
	age				int(12) not null,
	primary key 	(id)
);