package me.unisteven.algo.generics;

public class MemoryCell<T extends Comparable<T>> implements Comparable<MemoryCell<T>>{

    private T storedValue;

    public T read() {
        return storedValue;
    }

    public void write(T x) {
        storedValue = x;
    }

    @Override
    public int compareTo(MemoryCell<T> mc) {
        return this.read().compareTo(mc.read());
    }
}
