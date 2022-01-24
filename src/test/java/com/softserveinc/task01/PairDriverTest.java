package com.softserveinc.task01;

import com.softserveinc.task01.util.PairDriverUtil;
import com.softserveinc.task01.util.PairUtil;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;

import static com.softserveinc.task01.util.PairUtil.newPair;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class PairDriverTest {

    @Test
    void isPairPresentAndGenericClass() {
        assertNotNull(PairUtil.CLASS, "Pair class is not present");
        TypeVariable<? extends Class<?>>[] typeParameters = PairUtil.CLASS.getTypeParameters();
        assertEquals(2, typeParameters.length, "Pair should be Generic wit two parameters: String, Integer");
        System.out.println("typeParameters[0] = " + typeParameters[0]);
        System.out.println("typeParameters[0] = " + typeParameters[1]);
    }

    @Test
    public void testPairDriverLargestStadiumLargestAtEnd() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        assertNotNull(PairUtil.CLASS, "Pair class is not present");
        Object[] stadiums = (Object[]) Array.newInstance(PairUtil.CLASS, 3);
        stadiums[0] = newPair("A", 1);
        stadiums[1] = newPair("B", 2);
        stadiums[2] = newPair("C", 3);
        assertNotNull(PairDriverUtil.CLASS, "PairDriver class is not present");
        assertEquals("C", PairDriverUtil.invokeLargestStadium(stadiums));
    }

    @Test
    public void testPairDriverLargestStadiumLargestAtStart() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        assertNotNull(PairUtil.CLASS, "Pair class is not present");
        Object[] stadiums = (Object[]) Array.newInstance(PairUtil.CLASS, 3);
        stadiums[0] = newPair("A", 3);
        stadiums[1] = newPair("B", 2);
        stadiums[2] = newPair("C", 1);
        assertNotNull(PairDriverUtil.CLASS, "PairDriver class is not present");
        assertEquals("A", PairDriverUtil.invokeLargestStadium(stadiums));
    }

    @Test
    public void testPairDriverLargestStadiumLargestInMiddle() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        assertNotNull(PairUtil.CLASS, "Pair class is not present");
        Object[] stadiums = (Object[]) Array.newInstance(PairUtil.CLASS, 3);
        stadiums[0] = newPair("A", 1);
        stadiums[1] = newPair("B", 3);
        stadiums[2] = newPair("C", 2);
        assertNotNull(PairDriverUtil.CLASS, "PairDriver class is not present");
        assertEquals("B", PairDriverUtil.invokeLargestStadium(stadiums));
    }
}
