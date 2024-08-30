"""
Book: Grokking Algorithms - An Illustrated Guide for Programmers and Other Curious People
Author: Aditya Bhargava
Publisher: Manning Publications Co.
Example adapted by: Charles Fernandes de Souza
Date: August 29, 2024
"""

def binary_search(list, item):
    """Performs a binary search on a sorted list to find the index of a given item.

    Args:
        list: A sorted list of elements.
        item: The item to search for.

    Returns:
        The index of the item in the list, or None if the item is not found.
    """

    lower_bound = 0
    upper_bound = len(list) - 1

    while lower_bound <= upper_bound:
        middle_index = (lower_bound + upper_bound) // 2  # Use floor division to ensure an integer index
        guess = list[middle_index]  # Set the middle element as the current guess

        if guess == item:  # If the guessed element matches the target, return the index
            return middle_index
        elif guess > item:  # If the guess exceeds the target, adjust the upper bound
            upper_bound = middle_index - 1
        else:  # Otherwise, adjust the lower bound
            lower_bound = middle_index + 1

    return None  # Return None if the target element is not found

my_list = [1, 3, 5, 7, 9]
print(binary_search(my_list, 3))  # Expected output: 1
print(binary_search(my_list, -1))  # Expected output: None
