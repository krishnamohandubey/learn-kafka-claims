package com.kafka.claimkafka.claimserivce.repositories;

import com.kafka.claimkafka.claimserivce.entities.ClaimSettlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClaimSettlementRepository extends JpaRepository<ClaimSettlement, Long> {
    Optional<ClaimSettlement> findById(Long Id);
}
