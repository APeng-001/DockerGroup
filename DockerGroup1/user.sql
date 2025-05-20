create table user (
    id int auto_increment primary key,
    name varchar(255) not null,
    email varchar(255) not null
);

insert into
    user (name, email)
values ('weikerong', 'guangxi'),
    ('sunbaojun', 'hubei'),
    ('pengshuang', 'hubei'),
    ('liuzhengfan', 'hubei'),
    ('liangxiaoyan', 'hubei'),
    ('xieyanfeng', 'hubei');