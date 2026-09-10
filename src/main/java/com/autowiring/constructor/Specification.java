package com.autowiring.constructor;

public class Specification {
    private String brand;
    private String model;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Specification { brand : "+brand+", model : "+model+" }";
    }
}
