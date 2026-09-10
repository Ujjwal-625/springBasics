package com.autowiring.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext  =new
                ClassPathXmlApplicationContext("autowireByName.xml");

        Car car = (Car) applicationContext.getBean("mycar");

        car.showDetails();
    }
}
