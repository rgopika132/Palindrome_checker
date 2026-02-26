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
//Use Case 1: Application Entry &Welcome Message
    // Application constants

    static final String VERSION = "1.0";

    /**
     * Main method - Entry point of the Java application
     * JVM invokes this method automatically.
     */
    public static void main(String[] args) {

      // Display Welcome Message
      System.out.println("=====================================");
      System.out.println(" Welcome to Palindrome Checker" );

      System.out.println("=====================================");
      System.out.println("Application Name : Palindrome Checker");
      System.out.println("Application Version : " + VERSION);
      System.out.println("Application started successfully.");
      System.out.println("Ready for palindrome validation...");
    }
  }
