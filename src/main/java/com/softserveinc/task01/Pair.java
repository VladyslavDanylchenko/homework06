package com.softserveinc.task01;

/**
 * Immutable 2-tuple type.
 *
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class Pair<K, V> {

    private final K first;
    private final V second;

    /**
     * Create an ObjectTuple with the provided objects.
     *
     * @param first  The first object.
     * @param second The second object.
     */
    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "<" + first.toString() + ", " + second.toString() + ">";
    }

}
