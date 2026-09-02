package com.loose.coupling;

public interface UserDataProvider {
    // if you need to inject data to your app you only need to implement this interface and you can make changes in your code as per requirment don't need to change whole code for that
    public String getUserDetails();
}
