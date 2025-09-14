package com.kafka.claimkafka.claimserivce.dto;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class ClaimSettlementDto {
    private Long id;
    private BigDecimal netDearnessAllowance;
    private BigDecimal travelExpense;
    private BigDecimal hotelExpense;
    private BigDecimal mealExpense;
    private BigDecimal localConveyanceExpense;
    private BigDecimal otherExpense;
    private BigDecimal payableAmount;

    public ClaimSettlementDto() {}

    public ClaimSettlementDto(Long id, BigDecimal netDearnessAllowance, BigDecimal travelExpense, BigDecimal hotelExpense, BigDecimal mealExpense, BigDecimal localConveyanceExpense, BigDecimal otherExpense, BigDecimal payableAmount) {
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
