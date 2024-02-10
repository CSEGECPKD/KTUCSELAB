// QuickSort function
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        // Partition the array
        int pivot = partition(arr, low, high);

        // Recursively sort the sub-arrays
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }
}

// Partition function
int partition(int arr[], int low, int high) {
    // Choose the rightmost element as pivot
    int pivot = arr[high];

    // Index of smaller element
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {
        // If current element is smaller than or equal to pivot
        if (arr[j] <= pivot) {
            i++;
            // Swap arr[i] and arr[j]
            swap(&arr[i], &arr[j]);
        }
    }

    // Swap arr[i+1] and arr[high] (pivot)
    swap(&arr[i + 1], &arr[high]);

    return (i + 1);
}

// Swap function
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}
// Quick Sort algorithm implementation

#include <stdio.h>

// Function to swap two elements
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Function to partition the array and return the pivot index
int partition(int arr[], int low, int high) {
    int pivot = arr[high];  // Choosing the last element as the pivot
    int i = (low - 1);  // Index of smaller element

    for (int j = low; j <= high - 1; j++) {
        // If current element is smaller than or equal to pivot
        if (arr[j] <= pivot) {
            i++;  // Increment index of smaller element
            swap(&arr[i], &arr[j]);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    return (i + 1);
}

// Function to perform Quick Sort
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        // Partition the array
        int pivotIndex = partition(arr, low, high);

        // Recursively sort the sub-arrays
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }
}

// Function to print the array
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

// Driver code
int main() {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Original array: ");
    printArray(arr, n);

    quickSort(arr, 0, n - 1);

    printf("Sorted array: ");
    printArray(arr, n);

    return 0;
}
