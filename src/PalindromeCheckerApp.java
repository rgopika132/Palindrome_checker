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

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

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


    public static void main(String[] args) {

      // Original string
      String original = "level";

      // Create Stack and Queue
      Stack<Character> stack = new Stack<>();
      Queue<Character> queue = new LinkedList<>();

      // Insert characters into both Stack and Queue
      for (int i = 0; i < original.length(); i++) {
        char ch = original.charAt(i);
        stack.push(ch);      // LIFO
        queue.add(ch);       // FIFO (enqueue)
      }

      boolean isPalindrome = true;

      // Compare dequeue (FIFO) and pop (LIFO)
      while (!stack.isEmpty()) {
        char fromStack = stack.pop();      // LIFO
        char fromQueue = queue.remove();  // FIFO (dequeue)

        if (fromStack != fromQueue) {
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