package com.eldar.challenge.creditCard;

public abstract class Brand {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double calculateRate(){
        return (double) 0;
    };
}
