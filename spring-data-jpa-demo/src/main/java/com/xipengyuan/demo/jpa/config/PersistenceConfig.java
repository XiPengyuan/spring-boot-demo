package com.xipengyuan.demo.jpa.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("com.xipengyuan.demo.jpa.persistence.entity")
@EnableJpaRepositories("com.xipengyuan.demo.jpa.persistence.repository")
@EnableTransactionManagement
public class PersistenceConfig {
}
