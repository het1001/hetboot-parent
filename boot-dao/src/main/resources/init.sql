CREATE TABLE `user`(
 `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
 `create_time` DATETIME COMMENT '创建时间',
 `create_user` VARCHAR(10) COMMENT '创建者',
 `update_time` DATETIME COMMENT '更新时间',
 `update_user` VARCHAR(10) COMMENT '更新者',
 `domain` VARCHAR(20) COMMENT '域', PRIMARY KEY (`id`)
);