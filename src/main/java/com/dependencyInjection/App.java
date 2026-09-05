package com.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext  =new
                ClassPathXmlApplicationContext("applicationConstructorInjection.xml");

        Car car = (Car) applicationContext.getBean("mycar");

        car.showDetails();
    }
}
