package com.softserveinc.task02;

import java.util.ArrayList;

public class ShoppingList {
    // TODO: Add the private field items type of ArrayList<String>
    private ArrayList<String> items = new ArrayList<>();

    public void add(String item) {
        // TODO: Add the item to items list
        items.add(item);
    }

    public void delete(String item) {
        // TODO: delete all item from items list
        items.remove(item);
    }

    public int count() {
        // TODO: return count of items
        return items.size();
    }

    public void print() {
        // TODO: print the list
        System.out.println(items);
    }

}
