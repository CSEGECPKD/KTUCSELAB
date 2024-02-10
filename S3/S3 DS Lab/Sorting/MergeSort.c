
#include <stdio.h>

// Function to merge two sorted subarrays
void merge(int *arr, int lb, int mid, int ub) {
    int i = lb; // Starting index of left subarray
    int j = mid + 1; // Starting index of right subarray
    int k = lb; // Starting index of merged subarray
    int temp[30]; // Temporary array to store merged subarray

    // Merge the two subarrays in sorted order
    while (i <= mid && j <= ub) {
        if (arr[i] < arr[j]) {
            temp[k] = arr[i];
            i++;
        } else {
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    // Copy the remaining elements of left subarray, if any
    while (i <= mid) {
        temp[k] = arr[i];
        i++;
        k++;
    }

    // Copy the remaining elements of right subarray, if any
    while (j <= ub) {
        temp[k] = arr[j];
        j++;
        k++;
    }

    // Copy the merged subarray back to the original array
    for (int index = lb; index <= ub; index++) {
        arr[index] = temp[index];
    }
}

// Function to perform merge sort
void mergeSort(int *arr, int lb, int ub) {
    if (lb < ub) {
        int mid = (lb + ub) / 2; // Calculate the middle index

        // Recursively divide the array into two halves
        mergeSort(arr, lb, mid);
        mergeSort(arr, mid + 1, ub);

        // Merge the two sorted halves
        merge(arr, lb, mid, ub);
    }
}

int main() {
    int arr[] = {5, 2, 8, 12, 3};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Original array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    mergeSort(arr, 0, n - 1);

    printf("\nSorted array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}

