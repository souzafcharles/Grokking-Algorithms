"""
Book: Grokking Algorithms - An Illustrated Guide for Programmers and Other Curious People
Author: Aditya Bhargava
Publisher: Manning Publications Co.
Example adapted by: Charles Fernandes de Souza
Date: August 29, 2024
"""

def binary_search(list, item):
    lower = 0
    upper = len(list) - 1
    while lower <= upper:
        middle = (lower + upper) // 2  # Employ floor division to guarantee an integer index
        guess = list[middle]  # Assign the middle element as the current guess
        if guess == item:  # If the guessed element matches the target, return the index
            return middle
        if guess > item:  # If the guess exceeds the target, adjust the upper boundary
            upper = middle - 1
        else:
            lower = middle + 1  # Otherwise, adjust the lower boundary
    return None  # Return None if the target element is not found

my_list = [1, 3, 5, 7, 9]
print(binary_search(my_list, 3))  # Expected output: 1
print(binary_search(my_list, -1)) # Expected output: None
