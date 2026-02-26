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

  public class PalindromeCheckerApp {
  /**
   * UseCase2PalindromeCheckerApp
   *
   * Objective:
   * Check whether a hardcoded string is a palindrome
   * and print the result.
   *
   * Concepts Used:
   * - Class
   * - Main Method
   * - Static Keyword
   * - String & String Literal
   * - if-else Conditional Statement
   * - Console Output
   */



  /**
   * UseCase3PalindromeCheckerApp
   *
   * Objective:
   * Check whether a string is a palindrome
   * by reversing it using a for loop.
   *
   * Concepts Used:
   * - Class
   * - Main Method
   * - Static Keyword
   * - String (Immutable)
   * - for loop
   * - String Concatenation (+)
   * - equals() method
   * - Console Output
   */



  /**
   * UseCase4PalindromeCheckerApp
   *
   * Objective:
   * Check whether a string is a palindrome
   * using a character array and two-pointer technique.
   *
   * Concepts Used:
   * - Class
   * - Main Method
   * - char[] (Character Array)
   * - Array Indexing
   * - Two-Pointer Technique
   * - Time Complexity Awareness
   * - Console Output
   */



    public static void main(String[] args) {

      // Original string
      String original = "radar";

      // Convert String to character array
      char[] characters = original.toCharArray();

      // Two-pointer variables
      int start = 0;
      int end = characters.length - 1;

      boolean isPalindrome = true;

      // Compare characters using two-pointer approach
      while (start < end) {
        if (characters[start] != characters[end]) {
          isPalindrome = false;
          break;
        }
        start++;
        end--;
      }

      // Display result
      if (isPalindrome) {
        System.out.println("The string \"" + original + "\" is a Palindrome.");
      } else {
        System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
      }

      System.out.println("Program executed successfully.");
    }
  }



