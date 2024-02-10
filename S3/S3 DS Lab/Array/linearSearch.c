#include<stdio.h>

void main() {
    int a[10];
    for (int i = 0; i < 10; i++) {
        printf("Enter the number: ");
        scanf("%d", &a[i]);
    }

    int k = 0;
    printf("Enter the number you want to search: ");
    scanf("%d", &k);

    for (int i = 0; i < 10; i++) {
        if (a[i] == k) {
            printf("The number has been found at the index %d\n", i);
            break; // Optionally, you can break the loop after finding the first occurrence
        }
    }
}
