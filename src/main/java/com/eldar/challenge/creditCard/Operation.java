package com.eldar.challenge.creditCard;


public class Operation {

    Double amount;
    CreditCard card;

    public Operation(Double amount, CreditCard card) {
        this.amount = amount;
        this.card = card;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public boolean isValid(){
        int i = amount.compareTo(1000d);
        return i < 0;
    }

    private double getRate() {
        return card.getBrand().calculateRate();
    }
}
