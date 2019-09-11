package me.unisteven.algo.sorting;

import java.util.Arrays;

public class MergeSort implements SortArray {
    @Override
    public int[] sortArray(int[] input) {
        if (input.length <= 1) {
            return input;
        }
        int half = input.length / 2;
        int[] half1 = Arrays.copyOfRange(input, 0, half);
        int[] half2 = Arrays.copyOfRange(input, half, input.length);
        half1 = sortArray(half1);
        half2 = sortArray(half2);

        return merge(half1, half2);
    }

    public int[] merge(int[] input1, int[] input2) {
        int[] output = new int[input1.length + input2.length];
        int i = 0, j = 0, k = 0;

        while (i<input1.length && j <input2.length)
        {
            if (input1[i] < input2[j])
                output[k++] = input1[i++];
            else
                output[k++] = input2[j++];
        }

        // Store remaining elements of first array
        while (i < input1.length)
            output[k++] = input1[i++];

        // Store remaining elements of second array
        while (j < input2.length)
            output[k++] = input2[j++];
        return output;
    }

}
