package com.solvd.lab.v2.automation.shop.Order;

import com.solvd.lab.v2.automation.shop.Cart.Cart;

import java.util.ArrayList;
import java.util.Date;

public class OrderReceipt extends Order {
    private Date dateReceipt;

    public OrderReceipt(Date orderDate, int waitingDays, ArrayList<Cart> itemCartList) {
        super(orderDate, waitingDays, itemCartList);

        dateReceipt.setTime(orderDate.getTime() + waitingDays*24*3600*1000);
    }

    public Date getDateReceipt() {
        return dateReceipt;
    }
}