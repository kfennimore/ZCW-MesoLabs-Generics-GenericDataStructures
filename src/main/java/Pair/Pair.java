package Pair;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair <E extends Comparable> {

    private E first;
    private E second;

    public Pair(E key, E value) {
        this.first = key;
        this.second = value;
    }

    public E getFirst() {
        return this.first;
    }

    public E getSecond() {
        return this.second;
    }

    public E min () {
        if(first.compareTo(second) > 0) {
            return second;
        }
        return first;
    }

    public E max () {
        if (first.compareTo(second) < 0) {
            return second;
        }
        return first;
    }
}
