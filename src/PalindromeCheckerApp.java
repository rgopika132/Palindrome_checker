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

  class Node {
    char data;
    Node next;

    Node(char data) {
      this.data = data;
      this.next = null;
    }
  }

  public class PalindromeCheckerApp {

    // Create linked list from string
    public static Node createList(String str) {
      Node head = null, tail = null;

      for (char ch : str.toCharArray()) {
        Node newNode = new Node(ch);

        if (head == null) {
          head = newNode;
          tail = newNode;
        } else {
          tail.next = newNode;
          tail = newNode;
        }
      }
      return head;
    }

    // Find middle using fast & slow pointer
    public static Node findMiddle(Node head) {
      Node slow = head;
      Node fast = head;

      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow;
    }

    // Reverse linked list
    public static Node reverse(Node head) {
      Node prev = null;
      Node current = head;

      while (current != null) {
        Node next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      }

      return prev;
    }

    // Check palindrome
    public static boolean isPalindrome(Node head) {

      if (head == null || head.next == null)
        return true;

      Node middle = findMiddle(head);

      Node secondHalf = reverse(middle);

      Node firstHalf = head;

      while (secondHalf != null) {
        if (firstHalf.data != secondHalf.data)
          return false;

        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
      }

      return true;
    }

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String input = sc.nextLine();

      Node head = createList(input);

      if (isPalindrome(head))
        System.out.println("The string is a Palindrome.");
      else
        System.out.println("The string is NOT a Palindrome.");

      sc.close();
    }
  }

