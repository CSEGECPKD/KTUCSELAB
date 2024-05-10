/*
Create a class Sample with an integer array as attribute and two methods

1) Sort the array without using built in method

b) Search the sorted array using binary search
import java.util.Arrays;

public class Sample {
    private int[] array;

    public Sample(int[] array) {
        this.array = array;
    }

    public void sortArray() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public int binarySearch(int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
*/