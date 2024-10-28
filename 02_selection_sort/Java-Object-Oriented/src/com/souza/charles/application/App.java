package com.souza.charles.application;

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
