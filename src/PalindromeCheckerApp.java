//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * UseCase1PalindromeCheckerApp
 *
 * Objective:
 * Displays the application name and version at startup.
 * Demonstrates the use of:
 * - Class
 * - Main method
 * - Static keyword
 * - Console output
 */




    import java.util.Scanner;











          import java.util.Scanner;

          // Service class that contains palindrome logic
          class PalindromeChecker {

            // Method to check whether a string is palindrome
            public boolean checkPalindrome(String input) {

              // Convert string to character array
              char[] chars = input.toCharArray();

              int start = 0;
              int end = chars.length - 1;

              // Compare characters from both ends
              while (start < end) {

                if (chars[start] != chars[end]) {
                  return false;
                }

                start++;
                end--;
              }

              return true;
            }
          }

          // Main application class
          public class PalindromeCheckerApp {

            public static void main(String[] args) {

              Scanner scanner = new Scanner(System.in);

              System.out.print("Enter a string: ");
              String input = scanner.nextLine();

              // Create object of PalindromeChecker
              PalindromeChecker checker = new PalindromeChecker();

              boolean result = checker.checkPalindrome(input);

              if (result) {
                System.out.println("The string is a Palindrome.");
              } else {
                System.out.println("The string is NOT a Palindrome.");
              }

              scanner.close();
            }
          }

