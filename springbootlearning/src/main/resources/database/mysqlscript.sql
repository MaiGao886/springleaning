create table t_user
(
    id              int auto_increment comment '自增主键'
        primary key,
    username        varchar(50)   not null comment '用户名',
    password        varchar(50)   not null comment '密码',
    nickname        varchar(50)   null comment '昵称',
    mail            varchar(50)   null comment '邮箱',
    addr            varchar(255)  null comment '住址',
    age             int           null comment '年龄',
    sex             int default 0 not null comment '性别0未知1男2女',
    mobile          varchar(50)   null comment '手机号',
    create_time     datetime      null comment '创建时间',
    login_time      datetime      null comment '登录时间',
    last_login_time datetime      null comment '上次登录时间',
    login_count     int default 0 not null comment '登录次数'
);


