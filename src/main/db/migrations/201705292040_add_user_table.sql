create table users
(user_id UUID not null,
nick_name VARCHAR(200) not null,
sex VARCHAR(10) not null,
age int not null,
height int not null,
head_portrait VARCHAR(10) not null,
email VARCHAR(50) not null,
constraint users_user_id_pk primary key(user_id)
);
