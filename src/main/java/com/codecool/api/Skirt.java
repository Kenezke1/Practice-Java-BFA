package com.codecool.api;

public class Skirt extends Clothes {

    private boolean mini;

    Skirt(String name, String size, String type) {
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

    public boolean isMini() {
        return mini;
    }

    public void setMini(boolean mini) {
        this.mini = mini;
    }
}
