package com.codecool.api;

public class Skirt extends Clothes {

    boolean mini;

    public Skirt(String name, String size, String type) {
        super(name, size, type);
        this.mini = false;
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "mini=" + mini +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
