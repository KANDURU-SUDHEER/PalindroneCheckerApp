This project validates palindromes by leveraging the Last-In, First-Out (LIFO) principle of a Stack. By pushing characters onto a stack and then popping them, the application effectively reverses the string, which can then be compared to the original input.
Features
    Stack Integration: Utilizes java.util.Stack for character management.
    LIFO Logic: Maps stack behavior directly to string reversal logic.
    Case Sensitivity: Implements equalsIgnoreCase to ensure "Noon" is correctly identified as a palindrome.
    Simple & Clean: Clear console output for original vs. reversed strings.
 How It Works
    Input: The program takes a string (e.g., "noon").
    Push Phase: Each character is pushed onto the Stack one by one.
    Pop Phase: Characters are popped from the Stack. Because the last character pushed is the first one popped, the characters come out in reverse order.
    Verification: The original string is compared to the reversed string created from the popped characters.
     Installation & Usage
    Ensure you have Java JDK installed on your system.
    Copy the source code into a file named UseCase5PalindromeCheckerApp.java.
    Compile the program:
    bash
    javac UseCase5PalindromeCheckerApp.java
    Use code with caution.

Run the application:
    bash
    java UseCase5PalindromeCheckerApp
    Use code with caution.

Example Output
    text
    Input: noon
    Reversed: noon
    The string is a palindrome.
    Use code with caution.