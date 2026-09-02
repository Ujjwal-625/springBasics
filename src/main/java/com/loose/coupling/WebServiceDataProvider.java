package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider {
    //using same interface

    @Override
    public String getUserDetails() {
        return "Loosly coupled Web Service Data";
    }
}
