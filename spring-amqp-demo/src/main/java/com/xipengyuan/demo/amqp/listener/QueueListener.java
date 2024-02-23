package com.xipengyuan.demo.amqp.listener;

import com.xipengyuan.demo.amqp.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class QueueListener {

    @RabbitListener(queues = RabbitConfig.Q_NAME)
    public void listen(String in) {
        System.out.println("Listener receive: " + in);
    }
}
