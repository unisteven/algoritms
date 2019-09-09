package me.unisteven.algo.sorting;

public class QuickSort implements SortArray{

    @Override
    public int[] sortArray(int[] input) {
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        if(input.length > 3){
            // look for a pivot.
            int[] pivotArray = new int[3];
            pivotArray[0] = input[0];
            pivotArray[1] = input[input.length / 2];
            pivotArray[2] = input[input.length - 1];
            insertionSort.sortArray(pivotArray);
            int pivot = pivotArray[1];
            int[] half1 = new int[input.length];
            int[] half2 = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                if(input[i] > pivot){
                    half1[i] = input[i];
                }else{
                    half2[i] = input[i];
                }
            }
            mergeSort.merge(half1, half2);
        }
        return input;
    }
}
