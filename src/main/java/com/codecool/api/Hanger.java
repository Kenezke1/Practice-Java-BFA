package com.codecool.api;

public abstract class Hanger {

    private String material;
    private boolean isFull;

    public void setFull(boolean full) {
        isFull = full;
    }

    public Hanger(String material) {
        this.material = material;
        this.isFull = false;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isFull() {
        return isFull;
    }
}
