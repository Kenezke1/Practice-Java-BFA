package com.codecool.api;

public class HangerIsFullException extends Exception{

    HangerIsFullException(){
        super("The hanger is full!");
    }
}
