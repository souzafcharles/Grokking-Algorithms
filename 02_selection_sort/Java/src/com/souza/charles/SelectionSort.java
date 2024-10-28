package com.souza.charles;
/**
 Book: Grokking Algorithms - An Illustrated Guide for Programmers and Other Curious People
 Author: Aditya Bhargava
 Publisher: Manning Publications Co.
 Example adapted by: Charles Fernandes de Souza
 Date: October 28, 2024
 */
public class SelectionSort {

    /**
     * Method to find the index of the smallest element in the array
     * @param arr the array of integers
     * @return the index of the smallest element
     */
    public static int findSmallest(int[] arr) {
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
    public static int[] selectionSort(int[] arr) {
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

    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 2, 10};
        int[] sortedNumbers = selectionSort(numbers);
        // Print the sorted array
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }
    }
}