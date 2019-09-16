package me.unisteven.algo.lists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StevensArrayList<T> {
    private T[] values;
    private int currentIndex = 0;
    private int length = 1;

    public void add(T value){
        if(values == null){
            this.values = (T[]) Array.newInstance(value.getClass(), 1);
        }
        if(this.currentIndex < this.length){
            values[currentIndex] = value;
            this.currentIndex++;
            return;
        }
        T[] newList = (T[]) Array.newInstance(value.getClass(), values.length * 2);
        this.length = newList.length;
        if(this.values.length > 0) {
            for (int i = 0; i < this.values.length; i++) {
                newList[i] = values[i];
            }
        }
        newList[currentIndex] = value;
        currentIndex++;
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
        String values = "";
        for(T val : this.values) {
            if(val != null){
                values += val.toString() + ",";
            }
        }
        return "StevensArrayList{" +
                "values= [" + values + "]" +
                "length=" + length +
                '}';
    }
}
