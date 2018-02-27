package com.codecool.api;

public abstract class UnderClothes {

    String name;
    String size;
    String type;

    UnderClothes(String name, String size, String type){
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
