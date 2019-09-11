package me.unisteven.algo;

import me.unisteven.algo.sorting.InsertionSort;
import me.unisteven.algo.sorting.MergeSort;
import me.unisteven.algo.sorting.QuickSort;

import java.util.Arrays;
import java.util.Random;


public class Main{



    public static void main(String[] args){
//        Simple simple = new Simple();
//        simple.testTimes(100);
//        Recursion recursion = new Recursion();
//        recursion.runAll();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        Random r = new Random();
        int[] notSorted = new int[41];
        for (int i = 0; i < notSorted.length; i++) {
            notSorted[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(notSorted));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
//        System.out.println(Arrays.toString(insertionSort.sortArray(notSorted)));
//        System.out.println(Arrays.toString(mergeSort.sortArray(notSorted)));
//        System.out.println(Arrays.toString(quickSort.sortArray(notSorted)));
    }

}
