package com.darksideofthedev;


public class QuickSort {

    /**
     * Quick Sort Algorithm.
     *
     * Complexity = O(n log n) -> Logarithmic
     */
    public static void quickSort(int[] input, int start, int end) {

        // If input has only one element
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    public static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && input[--j] >= pivot) {
                continue;
            }
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) {
                continue;
            }
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
