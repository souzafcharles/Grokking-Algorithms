# -*- coding: utf-8 -*-
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
        middle = (lower + upper) // 2  # Floor division to ensure an integer index
        guess = list[middle]
        if guess == item:
            return middle
        if guess > item:
            upper = middle - 1
        else:
            lower = middle + 1
    return None

my_list = [1, 3, 5, 7, 9]
print(binary_search(my_list, 3))  # => 1
print(binary_search(my_list, -1)) # => None