package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Here we are using Inversion of control to inject the dependency
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationIOC.xml");
       UserManager userManager = (UserManager) context.getBean("userManager");

       System.out.println(userManager.getUserDetails());
        // now you don't needed to make multiple changes just created new class implementing same interface and rest of the code is same

        UserManager userManager2 = (UserManager) context.getBean("userManager1");
        System.out.println(userManager2.getUserDetails());

    }
}
