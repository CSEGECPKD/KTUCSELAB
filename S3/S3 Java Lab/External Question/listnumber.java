
public class AscendingDescendingList {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};
        int[] ascending = new int[numbers.length];
        int[] descending = new int[numbers.length];

        // Sort the numbers in ascending order
        for (int i = 0; i < numbers.length; i++) {
            ascending[i] = numbers[i];
            for (int j = 0; j < i; j++) {
                if (ascending[i] < ascending[j]) {
                    int temp = ascending[i];
                    ascending[i] = ascending[j];
                    ascending[j] = temp;
                }
            }
        }

        // Sort the numbers in descending order
        for (int i = 0; i < numbers.length; i++) {
            descending[i] = numbers[i];
            for (int j = 0; j < i; j++) {
                if (descending[i] > descending[j]) {
                    int temp = descending[i];
                    descending[i] = descending[j];
                    descending[j] = temp;
                }
            }
        }

        // Print the ascending order list
        System.out.println("Ascending order:");
        for (int num : ascending) {
            System.out.print(num + " ");
        }

        // Print the descending order list
        System.out.println("\nDescending order:");
        for (int num : descending) {
            System.out.print(num + " ");
        }
    }
}