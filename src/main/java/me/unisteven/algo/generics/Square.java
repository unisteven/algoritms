package me.unisteven.algo.generics;

public class Square extends Shape implements Comparable<Square>{

    @Override
    public int compareTo(Square other) {
        if (super.getArea() < other.getArea()) return -1;
        if (super.getArea() > other.getArea()) return 1;
        return 0;
    }
}
