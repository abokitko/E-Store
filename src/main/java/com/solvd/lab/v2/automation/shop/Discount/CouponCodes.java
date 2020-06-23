package com.solvd.lab.v2.automation.shop.Discount;

public class CouponCodes{
    private int code;
    private int discountPercent;

    public CouponCodes(int code, int discountPercent) {
        this.code = code;
        this.setDiscountPercent(discountPercent);
    }

    public int getDiscountPercent(){
        return this.discountPercent;
    }

    public int getDiscountCode(){
        return this.code;
    }

    public void setDiscountPercent(int discountPercent){
        this.discountPercent = discountPercent;
    }
}
