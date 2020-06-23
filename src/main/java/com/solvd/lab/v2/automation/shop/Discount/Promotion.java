package com.solvd.lab.v2.automation.shop.Discount;

import com.solvd.lab.v2.automation.shop.Product.Product;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

class Promotion extends Campaigns{
    private PromotionRule promotionRule;
    private String name;
    private String listOfProducts;
    private HashMap productPrice;

    public Promotion(String region, Date start, Date end, PromotionRule promotionRule, String name) {
        super(region, start, end);
        this.name = name;
        this.promotionRule = promotionRule;
    }

    public HashMap<BigDecimal, List<Product>> apply(HashMap<BigDecimal, List<Product>> productPrice){
        HashMap<BigDecimal, List<Product>> updateProductPrice = new HashMap<>();
        //update prices
        return updateProductPrice;
    }
}