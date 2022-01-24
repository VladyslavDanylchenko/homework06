package com.softserveinc.task02;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    public static final Class<ShoppingList> CLASS = ShoppingList.class;

    @Test
    void shouldHaveFieldItems() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        ShoppingList shoppingList = CLASS.getDeclaredConstructor().newInstance();
        assertNotNull(shoppingList, "ShoppingList should have a public constructor without parameters");
        Field items = CLASS.getDeclaredField("items");
        assertTrue(Modifier.isPrivate(items.getModifiers()));
        assertFalse(Modifier.isStatic(items.getModifiers()));
        assertEquals(List.class, items.getType());
    }

    @Test
    void add() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ShoppingList shoppingList = CLASS.getDeclaredConstructor().newInstance();
        Method add = CLASS.getDeclaredMethod("add", String.class);
        Method count = CLASS.getDeclaredMethod("count");
        assertEquals(0, count.invoke(shoppingList));
        add.invoke(shoppingList, "Milk");
        assertEquals(1, count.invoke(shoppingList));
    }

    @Test
    void delete() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        ShoppingList shoppingList = CLASS.getDeclaredConstructor().newInstance();
        Field itemsField = CLASS.getDeclaredField("items");
        itemsField.setAccessible(true);
        Object items = itemsField.get(shoppingList);
        Method add = items.getClass().getDeclaredMethod("add", Object.class);
        Method count = CLASS.getDeclaredMethod("count");
        assertEquals(0, count.invoke(shoppingList));
        add.invoke(items, "Milk");
        add.invoke(items, "Bread");
        add.invoke(items, "Snickers");
        assertEquals(3, count.invoke(shoppingList));
        Method delete = CLASS.getDeclaredMethod("delete", String.class);
        delete.invoke(shoppingList, "Snickers");
        assertEquals(2, count.invoke(shoppingList));
    }
}
