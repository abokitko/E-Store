package com.solvd.lab.v2.automation.shop.Attributes;

public class Size extends Attribute {
    private int code;
    private double size;

    public Size(int code, Double size) {
        this.code = code;
        this.size = size;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public double getSize() {
        return size;
    }
}
