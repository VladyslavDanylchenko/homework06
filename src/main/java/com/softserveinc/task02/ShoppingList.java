package com.softserveinc.task02;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    // TODO: Add the private field items type of ArrayList<String>
    private List<String> items = new ArrayList<>();

    public void add(String product) {
        // TODO: Add the product to list
        items.add(product);
    }

    public int count() {
        // TODO: Method should return size of items
        return items.size();
    }

    public void delete(String product) {
        // TODO: delete all products from list
        items.remove(product);
    }

    public void print() {
        // TODO: print the list
        System.out.println(items);
    }

}
