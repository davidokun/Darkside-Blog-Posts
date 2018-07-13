package com.darksideofthedev;


public class BubbleSort {

    /**
     * Bubble Sort Algorithm
     *
     * Complexity = O(n^2) -> Quadratic
     */
    public static void bubbleSort(int[] myArray) {
        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                }
            }
        }
    }

}