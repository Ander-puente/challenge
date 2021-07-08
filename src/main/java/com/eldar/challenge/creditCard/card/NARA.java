package com.eldar.challenge.creditCard.card;

import com.eldar.challenge.creditCard.Brand;

import java.time.LocalDate;

public class NARA extends Brand {
    private static NARA instance;

    private NARA(){
    }

    public static NARA getInstance() {
        if (instance == null) {
            instance = new NARA();
        }
        return instance;
    }

    @Override
    public Double calculateRate() {
        double rate = LocalDate.now().getDayOfMonth() * 0.5;
        if(rate < 0.3) return 0.3;
        if(rate > 5) return 5d;
        return rate;
    }
}
