package com.codecool.api;

public class Pants extends Clothes {

    private boolean isLong;

    Pants(String name, String size, String type) {

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
    public void setLong(boolean aLong) {
        isLong = aLong;
    }

    public boolean isLong() {

        return isLong;
    }
}
