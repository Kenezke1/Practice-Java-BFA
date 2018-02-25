package com.codecool.api;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Clothes> clothesList2 = new ArrayList<Clothes>();
    static List<SimpleHanger> hangers = new ArrayList<SimpleHanger>();

    public static void main(String[] args) {
        ClothesManager cm = new ClothesManager();
        clothesList2.addAll(cm.loadClothes());
        for (Clothes clothes:clothesList2) {
            if(clothes instanceof Pants) {
                hangers.add(new SimpleHanger("wood", clothes));
            }
            else if(clothes instanceof Shirts){
                hangers.add(new SimpleHanger("wood",clothes));
            }
            else if(clothes instanceof Skirt){
                hangers.add(new SimpleHanger("wood",clothes));
            }
        }
        for (SimpleHanger h:hangers) {
            System.out.println(h.getClothe().toString());
        }

    }
}
