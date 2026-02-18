PalindromeCheckerApp (Version 4.0) validates whether a given string is a palindrome using:

Character Array Conversion

Two-Pointer Technique

Efficient Character Comparison

Minimal Extra Logic

This implementation improves performance clarity and demonstrates optimized string validation using array-based processing.

 What is a Palindrome?

A palindrome is a word, phrase, or sequence that reads the same forward and backward.

Examples
Input	Output
madam	true
level	true
hello	false
racecar	true
🛠 Features

Converts string to character array

Uses start and end pointers

Efficient comparison loop

O(n) time complexity

Clean modular method design

Console-based interaction

 Algorithm Used – Two Pointer Technique

Convert the string to a char[]

Initialize:

start = 0

end = length - 1

Compare characters at both ends

Move inward:

start++

end--

If mismatch found → Not a palindrome

If loop completes → Palindrome

⏱ Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(n)
(due to character array conversion)