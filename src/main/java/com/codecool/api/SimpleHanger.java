package com.codecool.api;

public class SimpleHanger extends Hanger {

    private Object clothe;


    SimpleHanger(String material, Object clothe) {
        super(material);
        this.clothe = clothe;
    }

    public Object getClothe() {
        return clothe;
    }
}
