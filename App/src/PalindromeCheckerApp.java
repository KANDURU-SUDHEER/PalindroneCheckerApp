/**
 * =========================================
 * MAIN CLASS - UseCase- 2, palindromeApp
 * =========================================
 *use case 2 : hardcoded palindrome validation
 *
 * Application entry point of the
 * palindrome checker management system.
 *
 * description :
 * this class represents the entry point of the
 * palindrome checker management system
 *
 * At this stage the application :
 * - stores a predefined string
 * - compares characters from both ends
 * - determines weather the string is palindrome
 * - displays the result
 *
 * @author KANDURU-SUDHEER
 * @version 2.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for uc2
     * This is the first method executed by the JVM
     */
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Application Version: 2.0");

        String word = "madam";

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome.");

        }
    }
}



