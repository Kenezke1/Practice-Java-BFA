package com.codecool.api;

public class Main {

    public static void main(String[] args) {
        ClothesMenager cm = new ClothesMenager();

        for (Clothes c : cm.loadClothes()) {
            System.out.println(c.toString());

        }
    }
}
