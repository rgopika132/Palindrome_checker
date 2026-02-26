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



    public static void main(String[] args) {

      // Original string
      String original = "level";

      // Variable to store reversed string
      String reversed = "";

      // Reverse string using for loop
      for (int i = original.length() - 1; i >= 0; i--) {
        reversed = reversed + original.charAt(i);
      }

      // Compare original and reversed using equals()
      if (original.equals(reversed)) {
        System.out.println("The string \"" + original + "\" is a Palindrome.");
      } else {
        System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
      }

      // Display reversed string (for understanding)
      System.out.println("Reversed string: " + reversed);
    }
  }


