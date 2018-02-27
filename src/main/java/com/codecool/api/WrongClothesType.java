package com.codecool.api;

public class WrongClothesType extends Exception {

    WrongClothesType(){
        super("You can't put this type of clothe to the hanger!");
    }
}
