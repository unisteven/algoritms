package me.unisteven.algo.lists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StevensArrayList<T> {
    private T[] values;

    public void add(T value){
        if(values == null){
            this.values = (T[]) Array.newInstance(value.getClass(), 0);
        }
        T[] newList = (T[]) Array.newInstance(value.getClass(), values.length + 1);
        if(this.values.length > 0) {
            for (int i = 0; i < this.values.length; i++) {
                newList[i] = values[i];
            }
        }
        newList[values.length] = value;
        this.values = newList;
    }

    public T get(int index){
        return this.values[index];
    }

    public void set(int index, T value){
        this.values[index] = value;
    }

    @Override
    public String toString() {
        return "StevensArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
