/*
Write Java program That Implements Quicksort Algorithm for Sorting a list of names in ascending order.
*/
import java.util.Arrays;

public class QuicksortAlgorithm {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "David", "Eve"};
        
        System.out.println("Before sorting: " + Arrays.toString(names));
        
        quicksort(names, 0, names.length - 1);
        
        System.out.println("After sorting: " + Arrays.toString(names));
    }
    
    public static void quicksort(String[] names, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(names, low, high);
            quicksort(names, low, pivotIndex - 1);
            quicksort(names, pivotIndex + 1, high);
        }
    }
    
    public static int partition(String[] names, int low, int high) {
        String pivot = names[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (names[j].compareTo(pivot) < 0) {
                i++;
                swap(names, i, j);
            }
        }
        
        swap(names, i + 1, high);
        
        return i + 1;
    }
    
    public static void swap(String[] names, int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }
}
