package com.softserveinc.task01;

/**
 * Test driver for the ObjectPair class.
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class ObjectPairDriver {

    /**
     * Create several stadium pairs then print the name of the stadium with the largest capacity.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {

        ObjectPair[] stadiums = new ObjectPair[3];
        stadiums[0] = new ObjectPair("Bridgeforth Stadium", 25000);
        stadiums[1] = new ObjectPair("Michigan Stadium", 109901);
        stadiums[2] = new ObjectPair("Lane Stadium", 66233);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Returns the name of the stadium with the largest capacity.
     *
     * @param stadiums An array of ObjectPairs where each pair contains a stadium name followed by an
     *                 integer capacity
     * @return The name of the stadium with the largest capacity
     */
    public static String largestStadium(ObjectPair[] stadiums) {
        ObjectPair larger = stadiums[0];
        for (int i = 1; i < stadiums.length; i++) {
            if((int)stadiums[i].getSecond() > (int)larger.getSecond()) {
                larger = stadiums[i];
            }
        }
        return (String)larger.getFirst();
    }

}
