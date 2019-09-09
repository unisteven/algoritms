package me.unisteven.algo.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingTest {

    private List<SortArray> sortingmethods = new ArrayList<SortArray>();
    private MergeSort mergeSort = new MergeSort();

    @Before
    public void setUp() throws Exception {
//        this.sortingmethods.add(new InsertionSort());
        this.sortingmethods.add(new MergeSort());
//        this.sortingmethods.add(new QuickSort());
    }

    @Test
    public void arraySmallInput() {
        int[] input = {9,2};
        int[] expected = {2,9};
        for(SortArray sortArray : this.sortingmethods){
            Assert.assertArrayEquals(sortArray.sortArray(input), expected);
        }
    }

    @Test
    public void mergeTwoThingiesTogetheries(){
        int[] input1 = {1,2,3,4,5};
        int[] input2 = {6,7,8,9,10};
        System.out.println(Arrays.toString(mergeSort.merge(input1, input2)));
    }

    @Test
    public void emptyArray() {
        int[] input = {};
        int[] expected = {};
        for(SortArray sortArray : this.sortingmethods){
            Assert.assertArrayEquals(sortArray.sortArray(input), expected);
        }
    }

    @Test
    public void reversedInput() {
        int[] input = {7,6,5,4,3,2,1,0};
        int[] expected = {0,1,2,3,4,5,6,7};
        for(SortArray sortArray : this.sortingmethods){
            Assert.assertArrayEquals(sortArray.sortArray(input), expected);
        }
    }

    @Test
    public void arraySameValues() {
        int[] input = {8,9,1,8,9};
        int[] expected = {1,8,8,9,9};
        for(SortArray sortArray : this.sortingmethods){
            Assert.assertArrayEquals(sortArray.sortArray(input), expected);
        }
    }
    @Test
    public void arrayNegativeAndPositive() {
        int[] input = {-1,-2,5,-10};
        int[] expected = {-10,-2,-1,5};
        for(SortArray sortArray : this.sortingmethods){
            Assert.assertArrayEquals(sortArray.sortArray(input), expected);
        }
    }


}
