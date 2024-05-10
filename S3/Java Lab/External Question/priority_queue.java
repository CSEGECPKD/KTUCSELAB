/**
 * This program checks if a given string is palindromic using a priority queue.

*/
import java.util.PriorityQueue;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "racecar"; // Replace with your input string

        // Create a priority queue to store characters in reverse order
        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> b - a);

        // Add each character from the input string to the priority queue
        for (char c : input.toCharArray()) {
            queue.offer(c);
        }

        // Reconstruct the string by removing characters from the priority queue
        StringBuilder reconstructed = new StringBuilder();
        while (!queue.isEmpty()) {
            reconstructed.append(queue.poll());
        }

        // Check if the reconstructed string is equal to the input string
        boolean isPalindrome = input.equals(reconstructed.toString());

        // Print the result
        if (isPalindrome) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}