package com.kafka.claimkafka.claimserivce.service;

import com.kafka.claimkafka.claimserivce.dto.ClaimSettlementDto;
import com.kafka.claimkafka.claimserivce.entities.ClaimSettlement;

public interface ClaimSettlementService {
    ClaimSettlement createClaimSettlement(ClaimSettlementDto claimSettlementDto);
}
