package com.codecool.api;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Clothes> clothesList2 = new ArrayList<Clothes>();
    static List< Hanger> hangers = new ArrayList<Hanger>();

    public static void main(String[] args) {

        ClothesMenager cm = new ClothesMenager();
        clothesList2.addAll(cm.loadClothes());
        for (Clothes clothes:clothesList2) {
            if(clothes instanceof Pants) {
                hangers.add(new SimpleHanger("wood", (Pants)clothes));
            }
            else if(clothes instanceof Shirts){
                hangers.add(new SimpleHanger("wood",(Shirts)clothes));
            }
            else if(clothes instanceof Skirt){
                hangers.add(new SimpleHanger("wood",(Skirt)clothes));
            }
        }
        System.out.println(hangers.size());
        for (Hanger h:hangers) {
            System.out.println(h.toString());
        }


    }
}
