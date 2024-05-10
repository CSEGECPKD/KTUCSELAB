/*
Create an abstract class named Dummy with an integer array as data member and a search method Create a subclass that implements searches for an element using linear search Create another subclass that performs binary search on the array

*/
// Abstract class providing a common framework for search operations
abstract class Dummy {
    // Protected array to hold the elements to be searched
    protected int[] array;

    // Constructor initializes the array
    public Dummy(int[] array) {
        this.array = array;
    }

    // Abstract search method to be implemented by subclasses
    public abstract int search(int element);
}

// Subclass implementing linear search
class LinearSearch extends Dummy {
    // Constructor passes the array to the superclass
    public LinearSearch(int[] array) {
        super(array);
    }

    @Override
    public int search(int element) {
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                // Element found, return its index
                return i;
            }
        }
        // Element not found, return -1
        return -1;
    }
}

// Subclass implementing binary search
class BinarySearch extends Dummy {
    // Constructor passes the array to the superclass
    public BinarySearch(int[] array) {
        super(array);
    }

    @Override
    public int search(int element) {
        // Initialize left and right pointers to the array bounds
        int left = 0;
        int right = array.length - 1;

        // Continue searching while the left pointer is less than or equal to the right pointer
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // Check if the element is found at the middle index
            if (array[mid] == element) {
                return mid; // Element found, return its index
            }

            // If the element is smaller than the middle element, focus on the left half
            if (array[mid] < element) {
                left = mid + 1;
            } else {
                // Otherwise, focus on the right half
                right = mid - 1;
            }
        }

        // Element not found, return -1
        return -1;
    }
}
