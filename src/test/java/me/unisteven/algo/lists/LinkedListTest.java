package me.unisteven.algo.lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    private HanLinkedList<String> linkedList;

    @Before
    public void setUp() throws Exception {
        this.linkedList = new HanLinkedList<String>();
    }

    @Test
    public void insertFirstElement() {
        this.linkedList.addFirst("test");
        Assert.assertEquals("test", this.linkedList.get(0));
    }

    @Test
    public void addItem() {
        this.linkedList.addIem("test1");
        this.linkedList.addIem("test2");
        this.linkedList.addIem("test3");
        Assert.assertEquals("test3", this.linkedList.get(2));
    }

    @Test
    public void insertSecondElement() {
        this.linkedList.addIem("test");
        this.linkedList.addIem("test2");
        this.linkedList.addIem("test3");
        this.linkedList.insert(1, "test4");
        System.out.println(this.linkedList);
        Assert.assertEquals("test4", this.linkedList.get(1));
        Assert.assertEquals("test3", this.linkedList.get(3)); // the array is now moved a bit so there should be a new entry in the last.

    }

    @Test
    public void removeFirst() {
        this.linkedList.addIem("test1");
        this.linkedList.addIem("test2");
        this.linkedList.addIem("test3");
        this.linkedList.removeFirst();
        Assert.assertEquals("test2", this.linkedList.get(0));
    }

    @Test
    public void removeFirstWithEmpty() {
        this.linkedList.removeFirst();
        Assert.assertEquals(null, this.linkedList.get(0));
    }

    @Test
    public void deleteElement() {
        this.linkedList.addIem("test");
        this.linkedList.addIem("test2");
        this.linkedList.addIem("test3");
        this.linkedList.delete(1);
        Assert.assertEquals("test3", this.linkedList.get(1));
    }
}
