package me.unisteven.algo.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class StevensQueue<T> {

    private List list;

    public StevensQueue() {
        this.list = new ArrayList();
    }

    public void enqueue(T value){
        this.list.add(value);
    }

    public T dequeue(){
        T val = (T) this.list.get(0);
        this.list.remove(0);
        return val;
    }



}
