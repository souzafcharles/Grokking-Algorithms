package com.souza.charles;
/**
Book: Grokking Algorithms - An Illustrated Guide for Programmers and Other Curious People
Author: Aditya Bhargava
Publisher: Manning Publications Co.
Example adapted by: Charles Fernandes de Souza
Date: August 29, 2024
 */

public class BinarySearch {

    /**
     * Conducts a binary search on a sorted integer array to locate the index of a specified item.
     *
     * @param list A sorted array of integers.
     * @param item The item to be searched for.
     * @return The index of the item within the array, or null if the item is not found.
     */
    public static Integer binarySearch(int[] list, int item) {
        int lower = 0;
        int upper = list.length - 1;

        while (lower <= upper) {
            int middle = (lower + upper) / 2; // Calculate the middle index
            int guess = list[middle]; // Guess the middle element

            if (guess == item) { // If the guess is correct, return the index
                return middle;
            } else if (guess > item) { // If the guess is too high, adjust the upper bound
                upper = middle - 1;
            } else { // If the guess is too low, adjust the lower bound
                lower = middle + 1;
            }
        }

        return null; // Return null if the item is not found
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 3)); // => 1
        System.out.println(binarySearch(myList, -1)); // => null
    }
}
