package com.softserveinc.task02;

public class Main {
    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Snickers");
        shoppingList.add("Apples");
        shoppingList.add("Orange");
        shoppingList.print();
        shoppingList.delete("Snickers");
        shoppingList.print();
    }
}
