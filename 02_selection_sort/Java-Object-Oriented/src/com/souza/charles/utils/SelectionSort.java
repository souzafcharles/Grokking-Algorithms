package com.souza.charles.utils;

public class SelectionSort {
    /**
     * Method to find the index of the smallest element in the array
     * @param arr the array of integers
     * @return the index of the smallest element
     */
    public int findSmallest(int[] arr) {
        int smallest = arr[0];
        int smallestIndex = 0;
        // Iterate through the array to find the smallest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    /**
     * Method to sort the array using selection sort
     * @param arr the array of integers
     * @return the sorted array
     */
    public int[] selectionSort(int[] arr) {
        int[] newArr = new int[arr.length];
        // Iterate through the array to sort it
        for (int i = 0; i < newArr.length; i++) {
            int smallestIndex = findSmallest(arr);
            newArr[i] = arr[smallestIndex];
            // Remove the smallest element from the original array
            arr[smallestIndex] = Integer.MAX_VALUE; // Mark the element as "removed"
        }
        return newArr;
    }
}