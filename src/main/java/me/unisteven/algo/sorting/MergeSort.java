package me.unisteven.algo.sorting;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>>implements SortArray<T> {

    @Override
    public T[] sortArray(T[] input) {
        if (input.length <= 1) {
            return input;
        }
        int half = input.length / 2;
        T[] half1 = Arrays.copyOfRange(input, 0, half);
        T[] half2 = Arrays.copyOfRange(input, half, input.length);
        half1 = sortArray(half1);
        half2 = sortArray(half2);

        return merge(half1, half2);
    }

    public T[] merge(T[] input1, T[] input2) {
        T[] output = (T[]) new Comparable[input1.length + input2.length];
        int i = 0, j = 0, k = 0;

        while (i<input1.length && j <input2.length)
        {
            if (input1[i].compareTo(input2[j]) < 0)
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
