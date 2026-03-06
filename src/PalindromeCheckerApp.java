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








      import java.util .*;

    // Strategy Interface
    interface PalindromeStrategy {
        boolean checkPalindrome(String input);
    }

    // Strategy 1: Stack Based Palindrome
    class StackStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String input) {

            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    // Strategy 2: Deque Based Palindrome
    class DequeStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String input) {

            Deque<Character> deque = new ArrayDeque<>();

            for (char c : input.toCharArray()) {
                deque.addLast(c);
            }

            while (deque.size() > 1) {

                char first = deque.removeFirst();
                char last = deque.removeLast();

                if (first != last) {
                    return false;
                }
            }

            return true;
        }
    }

    // Service class that uses Strategy Pattern
    class PalindromeService {

        private PalindromeStrategy strategy;

        public PalindromeService(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String input) {
            return strategy.checkPalindrome(input);
        }
    }

    // Main Application
    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Palindrome Checker - Strategy Pattern");
            System.out.println("1. Stack Strategy");
            System.out.println("2. Deque Strategy");

            System.out.print("Choose algorithm: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            PalindromeStrategy strategy;

            if (choice == 1) {
                strategy = new StackStrategy();
            } else {
                strategy = new DequeStrategy();
            }

            PalindromeService service = new PalindromeService(strategy);

            boolean result = service.check(input);

            if (result) {
                System.out.println("The string is a Palindrome.");
            } else {
                System.out.println("The string is NOT a Palindrome.");
            }

            scanner.close();
        }
    }
