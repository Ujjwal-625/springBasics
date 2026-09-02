package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabase();
        UserManager userManager = new UserManager(userDataProvider);
        System.out.println(userManager.getUserDetails());

        // now you don't needed to make multiple changes just created new class implementing same interface and rest of the code is same
        UserDataProvider userWebProvider = new WebServiceDataProvider();
        System.out.println(userWebProvider.getUserDetails());


    }
}
