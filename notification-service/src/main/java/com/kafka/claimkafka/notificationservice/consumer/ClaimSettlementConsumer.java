package com.kafka.claimkafka.notificationservice.consumer;

import com.kafka.claimkafka.event.ClaimSettlementEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class ClaimSettlementConsumer {
    private static final Logger log = LoggerFactory.getLogger(ClaimSettlementConsumer.class);

    @Value("${spring.kafka.topic.claim-settlement-topic}")
    private String CLAIM_SETTLEMENT_TOPIC;


    @KafkaListener(topics = "${spring.kafka.topic.claim-settlement-topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void handleClaimSettlementEvent(ClaimSettlementEvent claimSettlementEvent) {

        if(claimSettlementEvent.getNetDearnessAllowance() != 0) {
            log.info("Received event with net dearness allowance: {}", claimSettlementEvent);
        } else {
            log.warn("Received event with missing net dearness allowance: {}", claimSettlementEvent);
        }
        System.out.println("Received notification for claim settlement: " + claimSettlementEvent);
    }




}
