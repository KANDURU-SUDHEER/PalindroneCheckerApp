import java.util.Stack;

/**
 * =============================================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =============================================================================
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author KANDURU-SUDHEER
 * @version 5.0
 * =============================================================================
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Create a variable to hold the reversed string
        String reversedInput = "";

        // Pop characters from the stack to reverse the string
        while (!stack.isEmpty()) {
            reversedInput += stack.pop();
        }

        // Compare with original sequence and display result
        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reversedInput);

        if (input.equalsIgnoreCase(reversedInput)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}




