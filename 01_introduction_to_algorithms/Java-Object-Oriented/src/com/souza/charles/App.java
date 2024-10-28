package com.souza.charles;
/**
 Book: Grokking Algorithms - An Illustrated Guide for Programmers and Other Curious People
 Author: Aditya Bhargava
 Publisher: Manning Publications Co.
 Example adapted by: Charles Fernandes de Souza
 Date: September 12, 2024
 */
public class App {
 
    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};
        BinarySearch binarySearch = new BinarySearch(myList, 3);
        Integer result = binarySearch.performBinarySearch();
        if (result != null) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Item not found");
        }
    }
}
