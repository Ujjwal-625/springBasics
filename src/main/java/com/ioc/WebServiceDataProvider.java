package com.ioc;

public class WebServiceDataProvider implements UserDataProvider {
    //using same interface

    @Override
    public String getUserDetails() {
        return "Loosly coupled Web Service Data and implementing Inversion of control ";
    }
}
