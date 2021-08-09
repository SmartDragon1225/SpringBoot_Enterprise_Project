create table student
(
    id          int                                not null
        primary key,
    name        varchar(20)                        null,
    age         int                                null,
    sex         varchar(10)                        null,
    place       varchar(20)                        null,
    creat_time  datetime default CURRENT_TIMESTAMP null,
    updata_time datetime default CURRENT_TIMESTAMP null
);
#添加数据
insert into student values ();