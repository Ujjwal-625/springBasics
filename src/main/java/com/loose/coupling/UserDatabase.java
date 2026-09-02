package com.loose.coupling;

public class UserDatabase implements UserDataProvider {
    public String getUserDetails(){
        return "Loosly Coupled SQL DB Data ";
    }
}
