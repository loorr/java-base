CREATE TABLE mall_db.account (
account_id varchar(20) NOT NULL COMMENT '账号id',
username varchar(100) DEFAULT "" NOT NULL COMMENT '用户名',
password varchar(200) NOT NULL COMMENT '密码',
balance double DEFAULT 0 NULL COMMENT '余额'
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE mall_db.transfer_order (
    order_id BIGINT UNSIGNED auto_increment NOT NULL COMMENT '订单号',
    from_accoun_id varchar(100) NOT NULL COMMENT 'from_accoun_id',
    to_account_id varchar(100) NOT NULL,
    amount DOUBLE NOT NULL COMMENT 'amount',
    is_success TINYINT(1) DEFAULT 0 NOT NULL COMMENT 'is_success',
    `time` DATETIME NULL COMMENT 'datetime',
    primary key (order_id)
)
    ENGINE=InnoDB
    DEFAULT CHARSET=utf8mb4
    COLLATE=utf8mb4_0900_ai_ci
    COMMENT='转账记录';
CREATE INDEX transfer_order_order_id_IDX USING BTREE ON mall_db.transfer_order (order_id);



CREATE TABLE `cash_order`(
    # 写数据字段
    `order_id` bigint unsigned auto_increment NOT NULL COMMENT '订单号',
    `account_id` varchar(100) NOT NULL COMMENT '账号id',
    `amount` double NOT NULL COMMENT '金额',
    `is_success` tinyint(1) DEFAULT 0 NOT NULL COMMENT '是否成功',
    `time` datetime NULL COMMENT 'datetime',
    `type` varchar(100) NOT NULL COMMENT '类型',
    primary key (order_id)
)ENGINE=InnoDB COMMENT='提现记录';

insert into cash_order(`account_id`, `amount`, `is_success`, `time`, `type`)
 values(1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT');

insert into cash_order(`account_id`, `amount`, `is_success`, `time`, `type`)
values
(1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT')
, (1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT')
, (1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT')
, (1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT')
, (1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT')
, (1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT')
, (1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT')
, (1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT')
, (1, 12, 1, '2020-01-01 00:00:00', 'DEPOSIT')
;

select account_id, amount
from cash_order
where amount > 11;

delete from cash_order
where amount > 11;

update cash_order set amount = amount + 1
where order_id=4;

update cash_order set amount = amount + 1, is_success = 0
where order_id=4;






