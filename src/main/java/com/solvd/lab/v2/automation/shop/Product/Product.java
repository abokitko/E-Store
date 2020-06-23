package com.solvd.lab.v2.automation.shop.Product;

import com.solvd.lab.v2.automation.shop.Attributes.Color;
import com.solvd.lab.v2.automation.shop.Attributes.Size;

import java.util.Objects;

public class Product {
    private int id;
    private Size size;
    private Color color;
    private int uniqueID;

    public Product(int id, Color color, Size size) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.uniqueID = Objects.hashCode(this.id) + Objects.hashCode(this.color) + Objects.hashCode(this.size);
    }

    public int getID() {
        return id;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }



}
