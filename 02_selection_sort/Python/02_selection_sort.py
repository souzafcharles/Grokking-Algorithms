```
Book: Grokking Algorithms - An Illustrated Guide for Programmers and Other Curious People
Author: Aditya Bhargava
Publisher: Manning Publications Co.
Example adapted by: Charles Fernandes de Souza
Date: October 28, 2024
```
```
Sort the elements of an array from smallest to largest 
and then develop a function to find the smallest element of the array.
```
def findSmallest(arr):
    # Initialises the first element as the smallest
    smallest = arr[0]
    smallest_index = 0
    for i in range(1, len(arr)):
        # Checks for any element smaller than the current smallest
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    return smallest_index

def selectionSort(arr):
    newArr = []
    # Iterates through the array to find the smallest element
    for i in range(len(arr)):
        smallest = findSmallest(arr)
        # Appends the smallest element to the new array and removes it from the original array
        newArr.append(arr.pop(smallest))
    return newArr

print(selectionSort([5, 3, 6, 2, 10]))  # Expected output: [2, 3, 5, 6, 10]
