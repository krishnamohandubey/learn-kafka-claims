package com.kafka.claimkafka.notificationservice.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.DefaultErrorHandler;

@Configuration
public class KafkaErrorHandlerConfig {
    @Bean
    public DefaultErrorHandler errorHandler() {
        return new DefaultErrorHandler((ConsumerRecord<?, ?> record, Exception exception) -> {
            System.err.println("Deserialization failed for record: " + record);
            exception.printStackTrace();
        });
    }
}
