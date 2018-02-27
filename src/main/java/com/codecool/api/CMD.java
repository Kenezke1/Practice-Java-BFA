package com.codecool.api;

import java.util.Scanner;

public class CMD {

    Scanner sc = new Scanner(System.in);
    Clothes clothes;

    public void run(){
        while(true){
            System.out.println("Hello my friend!");
            System.out.println("Let's put some clothes to a hanger!");
            System.out.println("What type clothe you want to put to the clotheshanger?(OverClothes or UnderClothes)");
            String typeOfClothe = sc.next().toUpperCase();
            if ("OVERCLOTHES".equals(typeOfClothe)) {

            }
        }
    }

    public Clothes createClothe(){
        System.out.println("What would be the name of the clothe? ");
        String name = sc.next();
        System.out.println("What would be the size?");
        String size = sc.next();
        System.out.println("What would be the type?");
        String type = sc.next();

    }

}
