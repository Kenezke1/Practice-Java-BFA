package com.codecool.api;

import java.util.ArrayList;
import java.util.List;

public class MultiHanger extends Hanger {

    private Clothes[] clothes;

    public MultiHanger(String material) {
        super(material);
        this.clothes = new Clothes[2];
    }


    public Clothes[] getClothes() {
        return clothes;
    }

    public void checkIsFull(){
        if(clothes[0] == null || clothes[1] == null){
            setFull(false);
        }
        else if(clothes[0] != null && clothes[1] != null){
            setFull(true);
        }
    }

    public void putOnHanger(Clothes obj)throws HangerIsFullException, WrongClothesType{
        checkIsFull();
        if(isFull()) throw new HangerIsFullException();
        if(clothes[0] == null && clothes[1] == null){
            clothes[0] = obj;
        }
        else if(clothes[0] instanceof OverClothesImpl && obj instanceof UnderClothesImpl){
            clothes[1] = obj;
        }
        else if(clothes[0] instanceof UnderClothesImpl && obj instanceof OverClothesImpl){
            clothes[1] = obj;
        }
        else{
            throw new WrongClothesType();
        }
    }
}
