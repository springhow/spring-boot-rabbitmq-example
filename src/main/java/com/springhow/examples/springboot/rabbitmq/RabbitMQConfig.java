package com.springhow.examples.springboot.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final Logger logger = LoggerFactory.getLogger(RabbitMQConfig.class);

    @Bean
    Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    Queue helloPojoQueue() {
        return new Queue("helloPojo");
    }

    @Bean
    MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

}
