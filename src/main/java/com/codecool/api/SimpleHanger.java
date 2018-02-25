package com.codecool.api;

public class SimpleHanger extends Hanger {

    private Pants pants;
    private Shirts shirt;
    private Skirt skirt;

     SimpleHanger(String material,Pants pants) {
        super(material);
        this.pants = pants;
    }


     SimpleHanger(String material, Shirts shirt){
         super(material);
         this.shirt = shirt;
     }

     SimpleHanger(String material, Skirt skirt){
         super(material);
         this.skirt = skirt;

     }

    @Override
    public String toString() {
        return "SimpleHanger{" +
                "pants=" + pants.toString() +
                ", shirt=" + shirt.toString() +
                ", skirt=" + skirt.toString() +
                '}';
    }
}
