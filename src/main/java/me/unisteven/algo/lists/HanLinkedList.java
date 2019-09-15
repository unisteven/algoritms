package me.unisteven.algo.lists;

public class HanLinkedList<T> {
    private HanListNode headerNode = new HanListNode();

    public void addFirst(T value){
        HanListNode node = new HanListNode();
        node.setValue(value);
        node.setNext(headerNode.getNext());
        headerNode.setNext(node);
    }

    public void addIem(T value){
        HanListNode node = this.headerNode;
        while(node.getNext() != null){
            node = node.getNext();
        }
        HanListNode newNode = new HanListNode();
        newNode.setValue(value);
        node.setNext(newNode);
        System.out.println(this.headerNode);
    }

    public void removeFirst(){

    }

    public void insert(int index, T value){
        HanListNode inserted = new HanListNode(value);
        HanListNode indexNode = this.headerNode;
        HanListNode previousNode = this.headerNode;
        for (int i = 0; i < (index + 1); i++) {
            previousNode = indexNode;
            indexNode = indexNode.getNext();
        }
        inserted.setNext(indexNode);
        previousNode.setNext(inserted);
    }

    public void delete(int index){
        if(index == 0){
            // first element
            HanListNode secondElement = this.headerNode.getNext();
            this.headerNode.setNext(secondElement.getNext());
            return;
        }
        HanListNode node = this.headerNode;
        HanListNode previous = this.headerNode;
        for (int i = 0; i < (index + 1); i++) {
            previous = node;
            node = node.getNext();
        }
        HanListNode nextNode = node.getNext();
        previous.setNext(nextNode);
    }

    public T get(int index){
        HanListNode node = this.headerNode.getNext();
        for (int i = 0; i < index ; i++) {
            node = node.getNext();
        }
        return (T) node.getValue();
    }

}
