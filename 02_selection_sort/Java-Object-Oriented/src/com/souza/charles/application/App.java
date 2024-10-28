package com.souza.charles.application;
/**
 Book: Grokking Algorithms - An Illustrated Guide for Programmers and Other Curious People
 Author: Aditya Bhargava
 Publisher: Manning Publications Co.
 Example adapted by: Charles Fernandes de Souza
 Date: October 28, 2024
 */
import com.souza.charles.utils.SelectionSort;

public class App {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 2, 10};
        SelectionSort sorter = new SelectionSort();
        int[] sortedNumbers = sorter.selectionSort(numbers);

        // Print the sorted array
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }
    }
}
