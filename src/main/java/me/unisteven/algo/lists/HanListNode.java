package me.unisteven.algo.lists;

public class HanListNode<T> {
    private T value;
    private HanListNode next;

    public HanListNode(T value) {
        this.value = value;
    }

    public HanListNode() {

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public HanListNode getNext() {
        return next;
    }

    public void setNext(HanListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "HanListNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
