package com.eldar.challenge.creditCard;

import java.time.Instant;
import java.util.Date;

public class CreditCard {

    private Brand brand;
    private Long number;
    private String cardholder;
    private Date expiringDate;

    public CreditCard(Brand brand, Long number, String cardholder, Date expiringDate) {
        this.brand = brand;
        this.number = number;
        this.cardholder = cardholder;
        this.expiringDate = expiringDate;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public Date getExpiringDate() {
        return expiringDate;
    }

    public void setExpiringDate(Date expiringDate) {
        this.expiringDate = expiringDate;
    }

    public boolean isValid(){
        return expiringDate.after(Date.from(Instant.now()));
    }
}
