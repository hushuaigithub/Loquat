create table friend
(id UUID not null,
user_id UUID not null,
friend_id UUID not null,
constraint friend_id_pk primary key(id)
);
