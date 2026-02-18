/**
 * =========================================
 * MAIN CLASS - UseCase- 1, palindromeApp
 * =========================================
 * Application entry point of the
 * palindrome checker management system.
 *
 * description :
 * this class represents the entry point of the
 * palindrome checker management system
 *
 * At this stage the application :
 * - starts execution from the main() method
 * -displays a welcome message
 * - shows application version
 *
 * @author KANDURU-SUDHEER
 * @version 1.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point
     * This is the first method executed by the JVM
     */
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Application Version: 1.0");

        String input = "MADAM";

        String reversed = new StringBuilder(input)
                .reverse()
                .toString();

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}


