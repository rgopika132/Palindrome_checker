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

      public class PalindromeCheckerApp {

        public static boolean isPalindrome(String str) {

          // Normalize string: remove spaces and convert to lowercase
          str = str.replaceAll("\\s+", "").toLowerCase();

          int start = 0;
          int end = str.length() - 1;

          while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
              return false;
            }

            start++;
            end--;
          }

          return true;
        }

        public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter a string: ");
          String input = scanner.nextLine();

          if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome (ignoring spaces and case).");
          } else {
            System.out.println("The string is NOT a Palindrome.");
          }

          scanner.close();
        }
      }