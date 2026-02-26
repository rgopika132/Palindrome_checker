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

import java.util.Deque;
import java.util.ArrayDeque;

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


    /**
     * UseCase5PalindromeCheckerApp
     *
     * Objective:
     * Check whether a string is a palindrome
     * using a Stack (LIFO principle).
     *
     * Concepts Used:
     * - Class
     * - Main Method
     * - Stack Data Structure
     * - Push Operation
     * - Pop Operation
     * - Reversal Logic
     * - Console Output
     */


    /**
     * UseCase6PalindromeCheckerApp
     * <p>
     * Objective:
     * Check whether a string is a palindrome
     * using both Queue (FIFO) and Stack (LIFO).
     * <p>
     * Concepts Used:
     * - Queue (FIFO)
     * - Stack (LIFO)
     * - Enqueue & Dequeue
     * - Push & Pop
     * - Logical Comparison
     */


    /**
     * UseCase7PalindromeCheckerApp
     *
     * Objective:
     * Check whether a string is a palindrome
     * using Deque (Double Ended Queue).
     *
     * Concepts Used:
     * - Deque Data Structure
     * - Front and Rear Access
     * - Optimized Comparison
     * - Console Output
     */



      public static void main(String[] args) {

        // Original string
        String original = "racecar";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
          deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

          char front = deque.removeFirst();
          char rear = deque.removeLast();

          if (front != rear) {
            isPalindrome = false;
            break;
          }
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