package com.codecool.api;

public class SimpleHanger extends Hanger {

    private Clothes clothe;

    public SimpleHanger(String material) {
        super(material);
        this.clothe = null;
    }


    public Clothes getClothe() {
        return clothe;
    }



    public void putOnHanger(Clothes obj) throws HangerIsFullException, WrongClothesType{
        if(isFull()) throw new HangerIsFullException();
        if(obj instanceof OverClothesImpl){
            clothe = obj;
        }
        else{
        throw new WrongClothesType();
        }
    }
}
