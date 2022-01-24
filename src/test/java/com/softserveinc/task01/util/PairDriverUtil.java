package com.softserveinc.task01.util;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PairDriverUtil {
    static final String CLASS_NAME = "com.softserveinc.task01.PairDriver";
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

    public static Object invokeLargestStadium(Object[] stadium) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method largestStadium = CLASS.getDeclaredMethod("largestStadium", Array.newInstance(PairUtil.CLASS, 0).getClass());
        return largestStadium.invoke(null, (Object)stadium);
    }
}
