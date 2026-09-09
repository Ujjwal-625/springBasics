package com.ioc;

public class UserDatabase implements UserDataProvider {
    public String getUserDetails(){
        return "Loosly Coupled SQL DB Data Implementing Inversion of control ";
    }
}
