package com.kafka.claimkafka.claimserivce.entities;


import jakarta.persistence.*;
import lombok.Builder;

import java.math.BigDecimal;


@Entity
@Table(name="claim_settlement")
@Builder
public class ClaimSettlement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal netDearnessAllowance;
    private BigDecimal travelExpense;
    private BigDecimal hotelExpense;
    private BigDecimal mealExpense;
    private BigDecimal localConveyanceExpense;
    private BigDecimal otherExpense;
    private BigDecimal payableAmount;

    public ClaimSettlement() {}
    public ClaimSettlement(Long id, BigDecimal netDearnessAllowance, BigDecimal travelExpense, BigDecimal hotelExpense, BigDecimal mealExpense, BigDecimal localConveyanceExpense, BigDecimal otherExpense, BigDecimal payableAmount) {
        this.id = id;
        this.netDearnessAllowance = netDearnessAllowance;
        this.travelExpense = travelExpense;
        this.hotelExpense = hotelExpense;
        this.mealExpense = mealExpense;
        this.localConveyanceExpense = localConveyanceExpense;
        this.otherExpense = otherExpense;
        this.payableAmount = payableAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getNetDearnessAllowance() {
        return netDearnessAllowance;
    }

    public void setNetDearnessAllowance(BigDecimal netDearnessAllowance) {
        this.netDearnessAllowance = netDearnessAllowance;
    }

    public BigDecimal getTravelExpense() {
        return travelExpense;
    }

    public void setTravelExpense(BigDecimal travelExpense) {
        this.travelExpense = travelExpense;
    }

    public BigDecimal getHotelExpense() {
        return hotelExpense;
    }

    public void setHotelExpense(BigDecimal hotelExpense) {
        this.hotelExpense = hotelExpense;
    }

    public BigDecimal getMealExpense() {
        return mealExpense;
    }

    public void setMealExpense(BigDecimal mealExpense) {
        this.mealExpense = mealExpense;
    }

    public BigDecimal getLocalConveyanceExpense() {
        return localConveyanceExpense;
    }

    public void setLocalConveyanceExpense(BigDecimal localConveyanceExpense) {
        this.localConveyanceExpense = localConveyanceExpense;
    }

    public BigDecimal getOtherExpense() {
        return otherExpense;
    }

    public void setOtherExpense(BigDecimal otherExpense) {
        this.otherExpense = otherExpense;
    }

    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }
}
