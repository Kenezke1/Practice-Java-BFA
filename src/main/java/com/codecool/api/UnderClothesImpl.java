package com.codecool.api;

public class UnderClothesImpl extends UnderClothes {

    private Under type;

    public UnderClothesImpl(String name, String size, Under type) {
        super(name, size);
        this.type = type;
    }

    public Under getType() {
        return type;
    }
}
