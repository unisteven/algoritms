package me.unisteven.algo.sorting;

public class QuickSort<T extends Comparable<T>> implements SortArray<T> {

    @Override
    public T[] sortArray(T[] input) {
        return quicksort(input, 0, input.length - 1);
    }

    private T[] quicksort(T[] input, int begin, int end){
        if(begin >= end){
            return input;
        }
        T pivot = input[begin]; //not efficient

        int center = getPartition(input, begin, end, pivot);
        quicksort(input, begin, center - 1);
        quicksort(input, center + 1, end);
        return input;

    }

    private int getPartition(T[] input, int begin, int end, T pivot) {
        int firstCounter = begin + 1;
        int lastCounter = end;
        while(firstCounter <= lastCounter){
            if(input[firstCounter].compareTo(pivot) < 0){
                firstCounter++;
            }else if(input[lastCounter].compareTo(pivot) > 0){
                lastCounter--;
            }else{
                // swap
                T value = input[lastCounter];
                input[lastCounter] = input[firstCounter];
                input[firstCounter] = value;
                firstCounter++;
                lastCounter--;
            }
        }
        // replace pivot
        T value = input[lastCounter];
        input[lastCounter] = pivot;
        input[begin] = value;
        return lastCounter;
    }

//    private int pivot(int[] input) {
//        InsertionSort insertionSort = new InsertionSort();
//        int[] pivotArray = new int[3];
//        pivotArray[0] = input[0];
//        pivotArray[1] = input[input.length / 2];
//        pivotArray[2] = input[input.length - 1];
//        insertionSort.sortArray(pivotArray);
//        return pivotArray[1];
//    }


}
