package com.eldar.challenge.creditCard.card;

import com.eldar.challenge.creditCard.Brand;

import java.time.LocalDate;

public class VISA extends Brand {
    private static VISA instance;

    private VISA(){
    }

    public static VISA getInstance() {
        if (instance == null) {
            instance = new VISA();
        }
        return instance;
    }

    @Override
    public Double calculateRate() {
        double rate = (double) LocalDate.now().getYear() / LocalDate.now().getMonthValue();
        if(rate < 0.3) return 0.3;
        if(rate > 5) return 5d;
        return rate;
    }
}
