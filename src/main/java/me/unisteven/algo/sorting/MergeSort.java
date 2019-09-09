package me.unisteven.algo.sorting;

import java.util.Arrays;

public class MergeSort implements SortArray {
    @Override
    public int[] sortArray(int[] input) {
//        if(input.length > 4){
//            int half = input.length / 2;
//            int[] half1 = Arrays.copyOfRange(input, 0, half);
//            int[] half2 = Arrays.copyOfRange(input, half, input.length);
//            sortArray(half1);
//            sortArray(half2);
//            merge(half1, half2);
//        }
        if (input.length <= 1) {
            return input;
        }
        int half = input.length / 2;
        int[] half1 = Arrays.copyOfRange(input, 0, half);
        int[] half2 = Arrays.copyOfRange(input, half, input.length);
        sortArray(half1);
        sortArray(half2);
        return merge(half1, half2);
    }

    public int[] merge(int[] input1, int[] input2) {
        int[] output = new int[input1.length + input2.length];
        
        System.out.println(Arrays.toString(output));
        return output;
    }

}
