package me.unisteven.algo.checker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SyntaxCheckerTest {

    private ReadFile readFile;

    @Before
    public void setUp() throws Exception {
        this.readFile = new ReadFile();
    }

    @Test
    public void testCorrecTSyntax() {
        Assert.assertTrue(this.readFile.checkFile("{[]}"));
    }
}
