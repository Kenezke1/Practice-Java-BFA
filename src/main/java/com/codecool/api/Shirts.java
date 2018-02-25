package com.codecool.api;

public class Shirts extends Clothes {

    boolean sleevesLong;

    public Shirts(String name, String size, String type) {
        super(name, size, type);
        this.sleevesLong = true;
    }

    @Override
    public String toString() {
        return "Shirts{" +
                "sleevesLong=" + sleevesLong +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
