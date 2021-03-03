package com.springhow.examples.springboot.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ListenerService {

    public static final Logger logger = LoggerFactory.getLogger(ListenerService.class);

    @RabbitListener(queues = "hello")
    public void getString(String message) {
        logger.info("From Queue : {}", message);
    }

    @RabbitListener(queues = "helloPojo")
    public void getPojo(Notification message) {
        logger.info("From Queue : {}", message);
    }
}
