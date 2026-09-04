package com.car.exapmple;

public class MyBean {
    private String Message;

    public void setMessage(String message) {
        Message = message;
    }

    public void showMessage() {
        System.out.println(Message);
    }

    @Override
    public String toString() {
        return "My Bean [Message=" + Message + "]";
    }
}
