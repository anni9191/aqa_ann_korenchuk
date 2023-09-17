package org.hillel.lesson16.homework;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Coconut", 15));
        productList.add(new Product("Juice", 3));
        productList.add(new Product("Tuna", 6));
        productList.add(new Product("Grapes", 22));
        productList.add(new Product("Beef", 11));

        ProductMarket market = new ProductMarket(productList);

        System.out.println("All Product Names: " + market.getAllProductNames());
        System.out.println("Product Names Sorted: " + market.getAllProductNamesSorted());
        System.out.println("Prices Greater Than 10: " + market.getPricesGreaterThan10());
        System.out.println("Prices Less Than 5: " + market.getPricesLessThan5());
        System.out.println("Prices as String: " + market.getPricesAsString());
    }
}
