package com.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext  =new
                ClassPathXmlApplicationContext("autowireByConstructor.xml");

        Car car = (Car) applicationContext.getBean("mycar");

        // so now if you created multiple beans of same type in this case Specification then it can cause confusion and cause errors
        // so we need to remove other beans from the xml file .

        car.showDetails();
    }
}
