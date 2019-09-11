package me.unisteven.algo.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SortingTest {

    private List<SortArray> sortingmethods = new ArrayList<SortArray>();
    @Before
    public void setUp(){
        this.sortingmethods.add(new InsertionSort());
        this.sortingmethods.add(new MergeSort());
        this.sortingmethods.add(new QuickSort());
    }

    @Test
    public void arraySmallInput() {
        for(SortArray sortArray : this.sortingmethods){
            Integer[] input = {9,2};
            Integer[] expected = {2,9};
            Assert.assertArrayEquals("The sorting method " + sortArray.getClass().getName() + " failed", sortArray.sortArray(input), expected);
        }
    }


    @Test
    public void emptyArray() {
        for(SortArray sortArray : this.sortingmethods){
            Integer[] input = {};
            Integer[] expected = {};
            Assert.assertArrayEquals("The sorting method " + sortArray.getClass().getName() + " failed",sortArray.sortArray(input), expected);
        }
    }

    @Test
    public void reversedInput() {
        for(SortArray sortArray : this.sortingmethods){
            Integer[] input = {7,6,5,4,3,2,1,0};
            Integer[] expected = {0,1,2,3,4,5,6,7};
            Assert.assertArrayEquals("The sorting method " + sortArray.getClass().getName() + " failed",sortArray.sortArray(input), expected);
        }
    }

    @Test
    public void arraySameValues() {
        for(SortArray sortArray : this.sortingmethods){
            Integer[] input = {8,9,1,8,9};
            Integer[] expected = {1,8,8,9,9};
            Assert.assertArrayEquals("The sorting method " + sortArray.getClass().getName() + " failed",sortArray.sortArray(input), expected);
        }
    }
    @Test
    public void arrayNegativeAndPositive() {
        for(SortArray sortArray : this.sortingmethods){
            Integer[] input = {-1,-2,5,-10};
            Integer[] expected = {-10,-2,-1,5};
            Assert.assertArrayEquals("The sorting method " + sortArray.getClass().getName() + " failed",sortArray.sortArray(input), expected);
        }
    }


}
