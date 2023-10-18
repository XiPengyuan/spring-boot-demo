-- 创建MySQL示例表
CREATE TABLE t_user (
    id      BIGINT      PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(16) NOT NULL,
    age     INT         NOT NULL,
    address VARCHAR(64),
    UNIQUE INDEX idx_name (name)
);
