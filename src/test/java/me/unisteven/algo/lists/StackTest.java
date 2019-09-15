package me.unisteven.algo.lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private HANStack stack;

    @Before
    public void setUp() throws Exception {
        this.stack = new HANStack();
    }

    @Test
    public void pushItem() {
        this.stack.push("test1");
        this.stack.push("test2");
        Assert.assertEquals("test2", this.stack.top());
    }

    @Test
    public void popItem() {
        this.stack.push("test1");
        this.stack.push("test2");
        Assert.assertEquals("test2", this.stack.pop());
    }

    @Test
    public void getSize() {
        this.stack.push("test1");
        this.stack.push("test2");
        Assert.assertEquals(2, this.stack.getSize());
    }

    @Test
    public void top() {
        this.stack.push("testabc");
        Assert.assertEquals("testabc", this.stack.top());
        this.stack.push("test2");
        Assert.assertEquals("test2", this.stack.top()); // new top should still work.
    }
}
