package com.solvd.lab.v2.automation.shop.Cart;

import java.math.BigDecimal;

public class Cart {
    //private List<String> itemCartList;
    private BigDecimal summary;

    public Cart(BigDecimal summary) {   //List<String> itemCartList,
        //this.itemCartList = new ArrayList<>();
        this.summary = summary;
    }

    public Cart() {
    }
}
