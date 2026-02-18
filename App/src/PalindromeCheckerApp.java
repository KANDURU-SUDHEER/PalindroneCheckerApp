import java.util.Scanner;

/**
 * ==========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * @author KANDURU-SUDHEER
 * @version 4.0
 */
public class PalindromeCheckerApp {

    /**
     * Checks whether the given string is a palindrome.
     * @param input The string to check
     * @return true if palindrome, otherwise false
     */
    public static boolean isPalindrome(String input) {

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (characters[start] != characters[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        System.out.println(input + " is palindrome? " + result);

        scanner.close();
    }
}




