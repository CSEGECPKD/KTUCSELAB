/*
Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user Write a program to find those pair of elements that has the maximum and minimumdifference among all element pairs
*/
import java.util.Scanner;

public class ElementPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Get the elements from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the pair of elements with maximum and minimum difference
        int maxDiff = Integer.MIN_VALUE;
        int minDiff = Integer.MAX_VALUE;
        int maxDiffIndex1 = -1;
        int maxDiffIndex2 = -1;
        int minDiffIndex1 = -1;
        int minDiffIndex2 = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[i] - arr[j]);

                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxDiffIndex1 = i;
                    maxDiffIndex2 = j;
                }

                if (diff < minDiff) {
                    minDiff = diff;
                    minDiffIndex1 = i;
                    minDiffIndex2 = j;
                }
            }
        }

        // Print the pair of elements with maximum and minimum difference
        System.out.println("Pair with maximum difference: " + arr[maxDiffIndex1] + " and " + arr[maxDiffIndex2]);
        System.out.println("Pair with minimum difference: " + arr[minDiffIndex1] + " and " + arr[minDiffIndex2]);

        scanner.close();
    }
}