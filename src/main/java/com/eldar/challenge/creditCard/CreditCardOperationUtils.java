package com.eldar.challenge.creditCard;

import com.eldar.challenge.creditCard.card.AMEX;
import com.eldar.challenge.creditCard.card.NARA;
import com.eldar.challenge.creditCard.card.VISA;

public class CreditCardOperationUtils {

    // Return Credit Card information
    public String getCardInfo(CreditCard card) {
        return  "Brand = " + card.getBrand().getName() +
                ", Number = " + card.getNumber() +
                ", Cardholder = '" + card.getCardholder() + '\'' +
                ", ExpiringDate = " + card.getExpiringDate();
    }

    // Return Operation validity
    public boolean isOperationValid(Operation operation){
        return operation.isValid();
    }

    // Return Credit Card validity
    public boolean isCreditCardValid(CreditCard card){
        return card.isValid();
    }

    // Identify same Credit Card
    public boolean isSameCreditCard(CreditCard card1, CreditCard card2){
        return card1.equals(card2);
    }

    // Return Operation rate, informing Brand and Amount
    public String getOperationRate(Operation operation){
        final Brand brand = operation.getCard().getBrand();
        Double rate = brand.calculateRate();
        Double amount = operation.getAmount();
        return  "Rate = " + Math.round(rate) +
                ", Brand = " + brand.getName() +
                ", Amount = " + amount;
    }

    public Brand getBrandByName(String name){
        switch (name.toLowerCase()) {
            case "visa":
                return VISA.getInstance();
            case "nara":
                return NARA.getInstance();
            case "amex":
                return AMEX.getInstance();
            default:
                throw new IllegalArgumentException("Card Brand not found");
        }
    }
}
