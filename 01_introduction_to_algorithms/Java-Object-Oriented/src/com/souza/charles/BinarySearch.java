package com.souza.charles;
/**
 Book: Grokking Algorithms - An Illustrated Guide for Programmers and Other Curious People
 Author: Aditya Bhargava
 Publisher: Manning Publications Co.
 Example adapted by: Charles Fernandes de Souza
 Date: September 12, 2024
 */
public class BinarySearch {

    int[] myList;
    int item;

    public BinarySearch() {}

    public BinarySearch(int[] myList, int item) {
        this.myList = myList;
        this.item = item;
    }

    public Integer performBinarySearch() {
        int lower = 0;
        int upper = myList.length - 1;

        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            int guess = myList[middle];
            if (guess == item) {
                return middle;
            } else if (guess > item) {
                upper = middle - 1;
            } else {
                lower = middle + 1;
            }
        }
        return null;
    }
}