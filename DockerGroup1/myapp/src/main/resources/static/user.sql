create database user;

use user;

create table user
(
    id    int auto_increment primary key,
    name  varchar(255) not null,
    position varchar(255) not null
);

insert into user (name, position)
values ('韦克荣', '队长'),
       ('Li Hua', 'lihua@example.com');

select *
from user;