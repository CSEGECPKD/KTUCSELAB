#include <stdio.h>

// Structure to represent a term in a polynomial
struct Term {
    int coefficient;
    int exponent;
};

// Function to add two polynomials
void addPolynomials(struct Term poly1[], int size1, struct Term poly2[], int size2, struct Term result[], int *size) {
    int i = 0, j = 0, k = 0;

    // Traverse both polynomials until one of them reaches the end
    while (i < size1 && j < size2) {
        // If the exponents are equal, add the coefficients and store the result
        if (poly1[i].exponent == poly2[j].exponent) {
            result[k].coefficient = poly1[i].coefficient + poly2[j].coefficient;
            result[k].exponent = poly1[i].exponent;
            i++;
            j++;
            k++;
        }
        // If the exponent of the first polynomial is greater, copy the term to the result
        else if (poly1[i].exponent > poly2[j].exponent) {
            result[k].coefficient = poly1[i].coefficient;
            result[k].exponent = poly1[i].exponent;
            i++;
            k++;
        }
        // If the exponent of the second polynomial is greater, copy the term to the result
        else {
            result[k].coefficient = poly2[j].coefficient;
            result[k].exponent = poly2[j].exponent;
            j++;
            k++;
        }
    }

    // Copy the remaining terms of the first polynomial, if any
    while (i < size1) {
        result[k].coefficient = poly1[i].coefficient;
        result[k].exponent = poly1[i].exponent;
        i++;
        k++;
    }

    // Copy the remaining terms of the second polynomial, if any
    while (j < size2) {
        result[k].coefficient = poly2[j].coefficient;
        result[k].exponent = poly2[j].exponent;
        j++;
        k++;
    }

    // Update the size of the result polynomial
    *size = k;
}

int main() {
    struct Term poly1[100], poly2[100], result[200];
    int size1, size2, size;

    // Read the size and terms of the first polynomial
    printf("Enter the size of the first polynomial: ");
    scanf("%d", &size1);
    printf("Enter the terms of the first polynomial (coefficient exponent):\n");
    for (int i = 0; i < size1; i++) {
        scanf("%d %d", &poly1[i].coefficient, &poly1[i].exponent);
    }

    // Read the size and terms of the second polynomial
    printf("Enter the size of the second polynomial: ");
    scanf("%d", &size2);
    printf("Enter the terms of the second polynomial (coefficient exponent):\n");
    for (int i = 0; i < size2; i++) {
        scanf("%d %d", &poly2[i].coefficient, &poly2[i].exponent);
    }

    // Add the polynomials
    addPolynomials(poly1, size1, poly2, size2, result, &size);

    // Print the result polynomial
    printf("Result polynomial (coefficient exponent):\n");
    for (int i = 0; i < size; i++) {
        printf("%d %d\n", result[i].coefficient, result[i].exponent);
    }

    return 0;
}
