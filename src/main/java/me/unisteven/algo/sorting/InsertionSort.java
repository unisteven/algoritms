package me.unisteven.algo.sorting;

public class InsertionSort implements SortArray{

    @Override
    public int[] sortArray(int[] input) {
        for(int i = 0; i < input.length; i++){
            for(int y = 0; y < input.length; y++){
                if(input[y] > input[i]){
                    // swap
                    int replaceValue = input[i];
                    input[i] = input[y];
                    input[y] = replaceValue;
                }
            }
        }
        return input;
    }
}
