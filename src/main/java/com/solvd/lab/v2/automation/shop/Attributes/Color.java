package com.solvd.lab.v2.automation.shop.Attributes;

public class Color extends Attribute {
    private int code;
    private String color;

    public Color(int code, String color) {
        this.code = code;
        this.color = color;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getColor() {
        return color;
    }
}