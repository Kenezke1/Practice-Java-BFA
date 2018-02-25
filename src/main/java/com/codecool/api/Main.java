package com.codecool.api;

public class Main {

    public static void main(String[] args) {
        ClothesManager cm = new ClothesManager();

        for (Clothes c : cm.loadClothes()) {
            System.out.println(c.toString());

        }
    }
}
