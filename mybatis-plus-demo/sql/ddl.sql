CREATE TABLE tb_user (
    id       BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键ID',
    user_num CHAR(6) NOT NULL UNIQUE COMMENT '编号',
    name     VARCHAR(30) COMMENT '姓名',
    age      INT COMMENT '年龄',
    grade    INT COMMENT '年级',
    email    VARCHAR(50) COMMENT '邮箱'
) COMMENT = '用户表';
