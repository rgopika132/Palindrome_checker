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



    public static void main(String[] args) {

      // Hardcoded string (String Literal)
      String word = "MALAYALAM";

      // Variable to store reversed string
      String reversed = "";

      // Reverse the string using loop
      for (int i = word.length() - 1; i >= 0; i--) {
        reversed = reversed + word.charAt(i);
      }

      // Check palindrome using if-else
      if (word.equals(reversed)) {
        System.out.println("The word \"" + word + "\" is a Palindrome.");
      } else {
        System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
      }

      System.out.println("Program executed successfully.");
    }
  }

