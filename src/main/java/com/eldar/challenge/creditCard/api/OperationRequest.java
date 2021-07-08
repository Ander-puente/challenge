package com.eldar.challenge.creditCard.api;

import com.eldar.challenge.creditCard.Operation;

public class OperationRequest {
    String brand;
    Double amount;

    public OperationRequest(String brand, Double amount) {
        this.brand = brand;
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
