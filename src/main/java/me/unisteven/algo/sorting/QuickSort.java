package me.unisteven.algo.sorting;

public class QuickSort implements SortArray {

    @Override
    public int[] sortArray(int[] input) {
        return quicksort(input, 0, input.length - 1);
    }

    private int[] quicksort(int[] input, int begin, int end){
        if(begin >= end){
            return input;
        }
        int pivot = input[begin]; //not efficient

        int center = getPartition(input, begin, end, pivot);
        quicksort(input, begin, center - 1);
        quicksort(input, center + 1, end);
        return input;

    }

    private int getPartition(int[] input, int begin, int end, int pivot) {
        int firstCounter = begin + 1;
        int lastCounter = end;
        while(firstCounter <= lastCounter){
            if(input[firstCounter] < pivot){
                firstCounter++;
            }else if(input[lastCounter] >= pivot){
                lastCounter--;
            }else{
                // swap
                int value = input[lastCounter];
                input[lastCounter] = input[firstCounter];
                input[firstCounter] = value;
                firstCounter++;
                lastCounter--;
            }
        }
        // replace pivot
        int value = input[lastCounter];
        input[lastCounter] = pivot;
        input[begin] = value;
        return lastCounter;
    }

    private int pivot(int[] input) {
        InsertionSort insertionSort = new InsertionSort();
        int[] pivotArray = new int[3];
        pivotArray[0] = input[0];
        pivotArray[1] = input[input.length / 2];
        pivotArray[2] = input[input.length - 1];
        insertionSort.sortArray(pivotArray);
        return pivotArray[1];
    }


}
