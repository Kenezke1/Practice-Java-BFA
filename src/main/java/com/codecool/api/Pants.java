package com.codecool.api;

public class Pants extends Clothes {

    boolean isLong;

    public Pants(String name, String size, String type) {
        super(name, size, type);
        this.isLong = true;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "isLong=" + isLong +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
