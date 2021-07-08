package com.eldar.challenge.creditCard.card;

import com.eldar.challenge.creditCard.Brand;

import java.time.LocalDate;

public class AMEX extends Brand {
    private static AMEX instance;

    private AMEX(){
    }

    public static AMEX getInstance() {
        if (instance == null) {
            instance = new AMEX();
        }
        return instance;
    }

    @Override
    public Double calculateRate() {
        double rate = LocalDate.now().getMonthValue() * 0.1;
        if(rate < 0.3) return 0.3;
        if(rate > 5) return 5d;
        return rate;
    }
}
