package com.softserveinc.task01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static com.softserveinc.task01.util.PairUtil.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class PairTest {


    @Test
    public void testPairGetFirst() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Object p1 = newPair("A", 1);
        assertEquals("A", getFirst(p1));

        Object p2 = newPair(2, "B");
        assertEquals(2, getFirst(p2));
    }

    @Test
    public void testPairGetSecond() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Object p1 = newPair("A", 1);
        assertEquals(1, getSecond(p1));

        Object p2 = newPair(2, "B");
        assertEquals("B", getSecond(p2));
    }

    @Test
    public void testPairToString() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Object p = newPair("A", 1);
        assertEquals("<A, 1>", p.toString());
    }
}
