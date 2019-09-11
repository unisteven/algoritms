package me.unisteven.algo.generics;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericsTest {

    private Generics generics;

    @Before
    public void setUp() throws Exception {
        this.generics = new Generics();
    }

    @Test
    public void findSmallestValueInStringArray() {
        String[] array = {"test", "tes", "a", "longitem"};
        String expected = "a";
        Assert.assertEquals(generics.min(array), expected);
    }

    @Test
    public void testMemoryCell() {
        String test = "test";
        MemoryCell<String> mcTest = new MemoryCell<String>();
        mcTest.write(test);
        String test2 = "test2";
        MemoryCell<String> mcTest2 = new MemoryCell<String>();
        mcTest2.write(test2);
        boolean smaller = mcTest.compareTo(mcTest2) < 0;
        Assert.assertTrue(smaller);
    }
}
