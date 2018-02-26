package com.codecool.api;

public class SimpleHanger extends Hanger {

    private Clothes clothe;


    SimpleHanger(String material) {
        super(material);
        this.clothe = null;
    }

    public Clothes getClothe() {
        return clothe;
    }
    public  void putOnHanger(Clothes obj){

    }
}
