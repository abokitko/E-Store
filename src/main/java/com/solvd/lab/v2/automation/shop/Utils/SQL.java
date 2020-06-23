package com.solvd.lab.v2.automation.shop.Utils;

import com.solvd.lab.v2.automation.shop.Attributes.Color;
import com.solvd.lab.v2.automation.shop.Attributes.Size;
import com.solvd.lab.v2.automation.shop.Product.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SQL {
    private static final String user = "root";
    private static final String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=UTC";
    private static final String password = "12345";
    private static final String sizesTableName = "sizes";
    private static final String colorsTableName = "colors";
    private static final String productsTableName = "products";

    private static Connection con;
    private static Statement stmt;
    private static int rs;

    public SQL() {
    }

    private static void executeQuery(String query) {
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeUpdate(query);

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            try { con.close(); } catch (SQLException se) { }
            try { stmt.close(); } catch (SQLException se) { }
        }
    }

    public static void insertSize(Size size) {
        createSizesTableIfNotExists();
        String query = String.format("INSERT INTO %s (code, size) VALUES (%d, %s);", sizesTableName, size.getCode(), size.getSize());
        executeQuery(query);
    }

    public static void insertColor(Color color) {
        createColorsTableIfNotExists();
        String query = String.format("INSERT INTO %s (code, color) VALUES (%d, \"%s\");", colorsTableName, color.getCode(), color.getColor());
        executeQuery(query);
    }

    public static void insertProduct(Product product) {
        insertSize(product.getSize());
        insertColor(product.getColor());
        createProductsTableIfNotExists();
        String query = String.format("INSERT INTO %s (unique_id, product_id, color_id, size_id) VALUES (%d, %d ,%d, %d);",
                                     productsTableName, product.getUniqueID(), product.getID(), product.getColor().getCode(), product.getSize().getCode());
        executeQuery(query);
    }

    private static void createSizesTableIfNotExists() {
        String query = String.format("CREATE TABLE IF NOT EXISTS %s (code INTEGER PRIMARY KEY, size DOUBLE)", sizesTableName);
        executeQuery(query);
    }

    private static void createColorsTableIfNotExists() {
        String query = String.format("CREATE TABLE IF NOT EXISTS %s (code INTEGER PRIMARY KEY, color VARCHAR(20));", colorsTableName);
        executeQuery(query);
    }

    private static void createProductsTableIfNotExists() {
        String query = "CREATE TABLE IF NOT EXISTS " + productsTableName
                + "  (unique_id      INTEGER PRIMARY KEY,"
                + "   color_id       INTEGER,"
                + "   size_id        INTEGER,"
                + "   product_id     INTEGER,"
                + "   FOREIGN KEY    (size_id) REFERENCES sizes(code),"
                + "   FOREIGN KEY    (color_id) REFERENCES colors(code))";
        executeQuery(query);
    }


}
