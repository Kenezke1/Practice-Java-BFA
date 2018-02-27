package com.codecool.api;

public abstract class Clothes {

    String name;
    String size;

    public Clothes(String name, String size) {
        this.name = name;
        this.size = size;
    }


    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
