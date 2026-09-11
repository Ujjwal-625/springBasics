package com.componentscan.usingAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Here we are using Inversion of control to inject the dependency
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        // name of the bean should be same while using the annotation @component("employee")
       Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee);
    }
}
