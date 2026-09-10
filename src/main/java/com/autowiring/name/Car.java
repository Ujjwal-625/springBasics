package com.autowiring.name;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public Car(){
        // since we have parmetrized constructor below but autoiwre by name will use setter to inject the dependency and will throw error if we don't have any default constructor.

    }

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void showDetails(){
        System.out.println("Car Details : "+specification);
    }
}
