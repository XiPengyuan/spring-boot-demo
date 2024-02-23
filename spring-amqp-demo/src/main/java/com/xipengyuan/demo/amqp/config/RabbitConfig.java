package com.xipengyuan.demo.amqp.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    public static final String Q_NAME = "my_queue";

    @Bean
    public Queue myQueue() {
        return new Queue(Q_NAME);
    }
}
