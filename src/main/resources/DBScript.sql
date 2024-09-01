drop database if exists blogPost_db;
create database blogPost_db;
use  blogPost_db;


create table blog_post(
   blog_id int auto_increment,
   title varchar(50) not null,
   content varchar(2000),
   category varchar(20) not null,
   tags varchar(20) not null,
   constraint blog_id_pk primary key (blog_id)

);


commit;

select * from blog_post;

