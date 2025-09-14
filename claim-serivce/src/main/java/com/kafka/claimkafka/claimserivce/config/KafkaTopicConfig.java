package com.kafka.claimkafka.claimserivce.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.claim-settlement-topic}")
    private String CLAIM_SETTLEMENT_TOPIC;
    @Bean
    public NewTopic claimTopic() {
        return new NewTopic(CLAIM_SETTLEMENT_TOPIC, 1, (short) 1);
    }
}
