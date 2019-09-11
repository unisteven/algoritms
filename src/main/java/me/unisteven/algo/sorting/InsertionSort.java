package me.unisteven.algo.sorting;

public class InsertionSort<T extends Comparable<T>> implements SortArray<T>{

    @Override
    public T[] sortArray(T[] input) {
        for(int i = 0; i < input.length; i++){
            for(int y = 0; y < input.length; y++){
                if(input[y].compareTo(input[i]) > 0){
                    // swap
                    T replaceValue = input[i];
                    input[i] = input[y];
                    input[y] = replaceValue;
                }
            }
        }
        return input;
    }
}
