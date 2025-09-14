package com.kafka.claimkafka.claimserivce.controller;

import com.kafka.claimkafka.claimserivce.dto.ClaimSettlementDto;
import com.kafka.claimkafka.claimserivce.entities.ClaimSettlement;
import com.kafka.claimkafka.claimserivce.service.impl.ClaimSettlementServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/claims")
public class ClaimController {
    private final ClaimSettlementServiceImpl claimSettlementServiceImpl;
    public ClaimController(ClaimSettlementServiceImpl claimSettlementServiceImpl) {
        this.claimSettlementServiceImpl = claimSettlementServiceImpl;
    }

    @PostMapping("/submit-claim")
    public ResponseEntity<ClaimSettlement> submitClaim(@RequestBody ClaimSettlementDto claimSettlementDto) {
        ClaimSettlement claimResponse = claimSettlementServiceImpl.createClaimSettlement(claimSettlementDto);
        return claimResponse != null ? ResponseEntity.ok(claimResponse) : ResponseEntity.badRequest().build();
    }
}
