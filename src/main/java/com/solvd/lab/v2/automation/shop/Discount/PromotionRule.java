package com.solvd.lab.v2.automation.shop.Discount;

class PromotionRule{
    private int discountPercent;
    private CouponCodes couponCodes;
    private boolean gift; //gift if you buy a certain product

    public PromotionRule(int code, int discountPercent) {
        this.discountPercent = discountPercent;
        this.couponCodes = new CouponCodes(code, discountPercent);
    }
}