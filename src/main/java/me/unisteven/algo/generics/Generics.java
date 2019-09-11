package me.unisteven.algo.generics;

public class Generics {

    public <T extends Comparable<T>> T min(T[] array) {
        T smallest = array[0];
        for(T t : array){
            smallest = t.compareTo(smallest) < 0 ? t : smallest;
        }
        return smallest;
    }
}