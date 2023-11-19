package com.xipengyuan.demo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EntityScan("com.xipengyuan.demo.persistence.document")
@EnableMongoRepositories("com.xipengyuan.demo.persistence.repository")
public class MongoConfig {
}
