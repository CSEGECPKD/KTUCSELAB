/*
Create a class Dummy that has integer array as attribute and a constructor to initialize the array clude member functions to find the second largest number and second smallest number. Create anobject and invoke the methods
*/
import java.util.Arrays;

class Dummy {
    private int[] numbers;

    public Dummy(int[] numbers) {
        this.numbers = numbers;
    }

    public int findSecondLargest() {
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];
    }

    public int findSecondSmallest() {
        Arrays.sort(numbers);
        return numbers[1];
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 8, 1, 9, 3 };
        Dummy dummy = new Dummy(numbers);
        int secondLargest = dummy.findSecondLargest();
        int secondSmallest = dummy.findSecondSmallest();
        System.out.println("Second largest number: " + secondLargest);
        System.out.println("Second smallest number: " + secondSmallest);
    }
}