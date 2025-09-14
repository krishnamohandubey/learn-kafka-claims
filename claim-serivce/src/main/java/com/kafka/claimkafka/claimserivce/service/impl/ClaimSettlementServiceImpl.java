package com.kafka.claimkafka.claimserivce.service.impl;

import com.kafka.claimkafka.claimserivce.dto.ClaimSettlementDto;
import com.kafka.claimkafka.claimserivce.entities.ClaimSettlement;
import com.kafka.claimkafka.claimserivce.repositories.ClaimSettlementRepository;
import com.kafka.claimkafka.claimserivce.service.ClaimSettlementService;
import com.kafka.claimkafka.event.ClaimSettlementEvent;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClaimSettlementServiceImpl implements ClaimSettlementService {
    @Value("${spring.kafka.topic.claim-settlement-topic}")
    private String CLAIM_SETTLEMENT_TOPIC;
    private final ClaimSettlementRepository claimSettlementRepository;
    private final ModelMapper modalMapper;
    private final KafkaTemplate<Long, ClaimSettlementEvent> kafkaTemplate;

    public ClaimSettlementServiceImpl(ClaimSettlementRepository claimSettlementRepository, ModelMapper modalMapper, KafkaTemplate<Long, ClaimSettlementEvent> kafkaTemplate) {
        this.claimSettlementRepository = claimSettlementRepository;
        this.modalMapper = modalMapper;
       // this.kafkaTemplate = kafkaTemplate;
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public ClaimSettlement createClaimSettlement(ClaimSettlementDto claimSettlementDto) {
        ClaimSettlement claim =modalMapper.map(claimSettlementDto, ClaimSettlement.class);
        ClaimSettlement savedClaim = claimSettlementRepository.save(claim);
        if (savedClaim != null) {
            /*
            ClaimSettlementEvent claimSettlementEvent = new ClaimSettlementEvent();
            claimSettlementEvent.setNetDearnessAllowance(savedClaim.getNetDearnessAllowance());
            claimSettlementEvent.setTravelExpense(savedClaim.getTravelExpense());
            claimSettlementEvent.setHotelExpense(savedClaim.getHotelExpense());
            claimSettlementEvent.setMealExpense(savedClaim.getMealExpense());
            claimSettlementEvent.setLocalConveyanceExpense(savedClaim.getLocalConveyanceExpense());
            claimSettlementEvent.setOtherExpense(savedClaim.getOtherExpense());
            claimSettlementEvent.setPayableAmount(savedClaim.getPayableAmount());
*/

            ClaimSettlementEvent claimEvent = modalMapper.map(savedClaim, ClaimSettlementEvent.class);
            kafkaTemplate.send(CLAIM_SETTLEMENT_TOPIC, savedClaim.getId(), claimEvent);


            return savedClaim;
        } else {
            return null;
        }
    }
}
