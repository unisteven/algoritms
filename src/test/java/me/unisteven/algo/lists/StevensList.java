package me.unisteven.algo.lists;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class StevensList {

    private StevensArrayList<Integer> stevensArrayList;

    @Before
    public void setUp() throws Exception {
        stevensArrayList = new StevensArrayList<Integer>();
        LinkedList<String> arrayList = new LinkedList<String>();
    }

    @Test
    public void insertValuesIntoList() {
        stevensArrayList.add(1);
        stevensArrayList.add(0);
        stevensArrayList.add(10);
        Assert.assertEquals((int)stevensArrayList.get(0), 1);
    }
}
