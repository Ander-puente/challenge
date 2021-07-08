package com.eldar.challenge.creditCard.api;

import com.eldar.challenge.creditCard.Brand;
import org.springframework.http.HttpStatus;

public class OperationResponse {
    HttpStatus status;
    String message;
    Double rate;
    Brand brand;
    Double amount;

    public OperationResponse(HttpStatus status, String message, Double rate, Brand brand, Double amount) {
        this.status = status;
        this.message = message;
        this.rate = rate;
        this.brand = brand;
        this.amount = amount;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
