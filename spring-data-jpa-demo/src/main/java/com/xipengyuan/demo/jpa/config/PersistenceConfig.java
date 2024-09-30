package com.xipengyuan.demo.jpa.config;

import org.springframework.context.annotation.Configuration;

@Configuration
/*
 * 由于实体和Repositories都在本项目的默认auto-configuration package（com.xipengyuan.demo.jpa）下
 * 下面的注解也可以选择不添加
 */
// @EntityScan("com.xipengyuan.demo.jpa.persistence.entity")
// @EnableJpaRepositories("com.xipengyuan.demo.jpa.persistence.repository")
public class PersistenceConfig {
}
