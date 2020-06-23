package com.solvd.lab.v2.automation.shop.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public class PriceBook{
    private HashMap<BigDecimal, List<Product>> productPrice;
    public PriceBook(){
        this.productPrice = new HashMap();
    }
}
