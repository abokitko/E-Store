package com.solvd.lab.v2.automation.shop.Account;

public class Registered implements User {
    public String userLogin;
    public String userName;
    public Registered(String userLogin, String userName) {
        this.userLogin = userLogin;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLogin(){
        return userLogin;
    }

    @Override
    public void addToCart() {

    }

    public void buyShoes() {
        //some logic
    }

}