package com.autowiring.name;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public Car(){
        // since we have parmetrized constructor below but autoiwre by name will use setter to inject the dependency and will throw error if we don't have any default constructor.
        // If you want Autowiring by name to work then name of the bean and name of the property should be same so that dependency can be injected based on the name
        // so we need to create a bean with name as specification in the xml file .
    }

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void showDetails(){
        System.out.println("Car Details : "+specification);
    }
}
