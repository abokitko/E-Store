package com.solvd.lab.v2.automation.shop.Order;

import com.solvd.lab.v2.automation.shop.Cart.Cart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class Order extends Cart {
    private String orderId;
    private Date orderDate;
    private boolean shipping;
    private int waitingDays;

    private ArrayList<Cart> itemCartList;

    public Order(Date orderDate, int waitingDays, ArrayList<Cart> itemCartList){
        this.waitingDays = waitingDays;
        this.orderDate = orderDate;
        this.itemCartList = new ArrayList<Cart>();
    }

    public Order(BigDecimal summary){
        super(summary);
    }
}