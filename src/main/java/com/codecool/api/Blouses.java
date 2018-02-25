package com.codecool.api;

public class Blouses extends Clothes {

    private boolean isViragos;

    public Blouses(String name, String size, String type) {
        super(name, size, type);
        this.isViragos = false;
    }

    public boolean isViragos() {
        return isViragos;
    }

    @Override
    public String toString() {
        return "Blouses{" +
                "isViragos=" + isViragos +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
