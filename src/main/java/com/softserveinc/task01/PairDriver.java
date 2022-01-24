package com.softserveinc.task01;

import javax.print.DocFlavor;

/**
 * Test driver for the ObjectPair class.
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class PairDriver {

    /**
     * Create several stadium pairs then print the name of the stadium with the largest capacity.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {

        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<>("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair<>("Michigan Stadium", 109901);
        stadiums[2] = new Pair<>("Lane Stadium", 66233);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Returns the name of the stadium with the largest capacity.
     *
     * @param stadiums An array of ObjectPairs where each pair contains a stadium name followed by an
     *                 integer capacity
     * @return The name of the stadium with the largest capacity
     */
    public static String largestStadium(Pair<String, Integer>[] stadiums) {
        Pair<String, Integer> larger = stadiums[0];
        for (int i = 1; i < stadiums.length; i++) {
            if(stadiums[i].getSecond() > larger.getSecond()) {
                larger = stadiums[i];
            }
        }
        return larger.getFirst();
    }

}
