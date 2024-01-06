package com.xipengyuan.demo.mongo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EntityScan("com.xipengyuan.demo.mongo.persistence.document")
@EnableMongoRepositories("com.xipengyuan.demo.mongo.persistence.repository")
public class MongoConfig {
}
