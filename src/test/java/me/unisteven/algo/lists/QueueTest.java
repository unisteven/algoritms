package me.unisteven.algo.lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

    StevensQueue queue;

    @Before
    public void setUp() throws Exception {
        this.queue = new StevensQueue();
    }

    @Test
    public void firstInFirstOut() {
        this.queue.enqueue("test1");
        this.queue.enqueue("test2");
        Assert.assertEquals("test1", this.queue.dequeue());
    }
}
