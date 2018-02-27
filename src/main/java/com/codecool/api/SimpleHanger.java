package com.codecool.api;

public class SimpleHanger extends Hanger {

    private Overclothes clothe;
    private UnderClothes clothe;


    SimpleHanger(String material) {
        super(material);
        this.clothesOver = null;
    }

    public Clothes getClothe() {
        return clothe;
    }
    public void putOnHanger(Clothes obj){

    }
}
