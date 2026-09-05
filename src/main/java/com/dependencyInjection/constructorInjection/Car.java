package com.dependencyInjection.constructorInjection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void showDetails(){
        System.out.println("Car Details : "+specification);
    }
}
