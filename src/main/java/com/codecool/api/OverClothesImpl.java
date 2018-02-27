package com.codecool.api;

public class OverClothesImpl extends Overclothes {

    private Over type;

    public OverClothesImpl(String name, String size, Over type) {
        super(name, size);
        this.type = type;
    }

    public Over getType() {
        return type;
    }

    
}
