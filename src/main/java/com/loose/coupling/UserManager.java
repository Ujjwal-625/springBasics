package com.loose.coupling;

public class UserManager {
    private UserDataProvider userDataProvider = new UserDatabase();

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }
    public String getUserDetails(){
        return userDataProvider.getUserDetails();
    }
}
