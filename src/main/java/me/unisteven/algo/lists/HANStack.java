package me.unisteven.algo.lists;

public class HANStack<T> {

    private int top = - 1;
    private HanLinkedList list;

    public HANStack() {
        this.list = new HanLinkedList();
    }

    public T pop(){
        if(this.top == 0) {
            return null;
        }
        T value = (T) list.get(this.top);
        this.list.delete(this.top);
        this.top--;
        return value;
    }

    public void push(T value){
        this.top++;
        this.list.addIem(value);
    }

    public T top(){
        return (T) this.list.get(this.top);
    }

    public int getSize(){
        return this.top + 1; // add one to the index to get the size.
    }
}
