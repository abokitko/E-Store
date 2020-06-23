package com.solvd.lab.v2.automation.shop.Attributes;

abstract class Attribute{
    private int code;
    double size;
    private String name;
    private String color;

    public int getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }

    public double getSize(){
        return size;
    }
}
