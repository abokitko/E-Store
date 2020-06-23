package com.solvd.lab.v2.automation.shop;

import com.solvd.lab.v2.automation.shop.Attributes.Color;
import com.solvd.lab.v2.automation.shop.Attributes.Size;
import com.solvd.lab.v2.automation.shop.Product.Product;
import com.solvd.lab.v2.automation.shop.Utils.SQL;

public class Main {
    public static void main(String[] args) {
        Color color = new Color(10, "Red");
        Size size = new Size(10, (double) 36);
        Product product = new Product(10, color, size);

        SQL.insertProduct(product);
    }
}
