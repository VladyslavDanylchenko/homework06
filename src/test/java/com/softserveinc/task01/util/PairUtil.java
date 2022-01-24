package com.softserveinc.task01.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PairUtil {
    static final String CLASS_NAME = "com.softserveinc.task01.Pair";
    public static final Class<?> CLASS;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(CLASS_NAME);
        } catch (ClassNotFoundException ex) {
            cls = null;
        }
        CLASS = cls;
    }

    public static Object newPair(Object first, Object second) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> declaredConstructor = CLASS.getDeclaredConstructor(Object.class, Object.class);
        return declaredConstructor.newInstance(first, second);
    }

    public static Object getFirst(Object pair) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return CLASS.getDeclaredMethod("getFirst").invoke(pair);
    }

    public static Object getSecond(Object pair) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return CLASS.getDeclaredMethod("getSecond").invoke(pair);
    }
}
