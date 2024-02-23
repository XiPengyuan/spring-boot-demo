package com.xipengyuan.demo.amqp;

import com.xipengyuan.demo.amqp.config.RabbitConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VeryQuickTest {

    @Autowired
    AmqpTemplate template;

    @Test
    void testSend() throws InterruptedException {
        template.convertAndSend(RabbitConfig.Q_NAME, "foo");
        template.convertAndSend(RabbitConfig.Q_NAME, "bar");
        Thread.sleep(5000);
    }
}
