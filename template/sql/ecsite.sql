set names utf8;
set foreign_key_checks = 0;
drop database if exists ecsite;

create database if not exists ecsite;
	use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
	id int not null primary key auto_increment,
	login_id varchar(16) unique,
	login_pass varchar(16),
	user_name varchar(50),
	insert_data dateime;
	udated_data datatime
);

drop table if exists item_info_translation;

create table item_info_transaction(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datatime;
	delete_date datetime
	);

	INSERT INTO item_info_transaction(item_name,iten_price,item_stock) VALUES("ノートBook", 100, 50);

	INSERT INTO login_user_transaction(login_id, login_pass, user_name) VALUES("internous", "internous01", "test");