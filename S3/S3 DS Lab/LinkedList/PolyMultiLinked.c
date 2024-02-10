#include <stdio.h>

// Structure to represent a term in a polynomial
typedef struct {
    int coefficient;
    int exponent;
} Term;

// Function to multiply two polynomials
void multiplyPolynomials(Term poly1[], int size1, Term poly2[], int size2, Term result[]) {
    // Initialize the result polynomial with all terms set to zero
    for (int i = 0; i < size1 + size2 - 1; i++) {
        result[i].coefficient = 0;
        result[i].exponent = 0;
    }

    // Multiply each term of poly1 with each term of poly2
    for (int i = 0; i < size1; i++) {
        for (int j = 0; j < size2; j++) {
            // Multiply the coefficients and add the exponents
            result[i + j].coefficient += poly1[i].coefficient * poly2[j].coefficient;
            result[i + j].exponent = poly1[i].exponent + poly2[j].exponent;
        }
    }
}

int main() {
    // Example polynomials
    Term poly1[] = {{2, 3}, {4, 2}, {3, 1}};
    int size1 = sizeof(poly1) / sizeof(poly1[0]);

    Term poly2[] = {{-1, 2}, {2, 1}, {1, 0}};
    int size2 = sizeof(poly2) / sizeof(poly2[0]);

    // Resultant polynomial
    Term result[size1 + size2 - 1];

    // Multiply the polynomials
    multiplyPolynomials(poly1, size1, poly2, size2, result);

    // Display the result polynomial
    printf("Resultant Polynomial: ");
    for (int i = 0; i < size1 + size2 - 1; i++) {
        printf("%dx^%d ", result[i].coefficient, result[i].exponent);
        if (i != size1 + size2 - 2) {
            printf("+ ");
        }
    }

    return 0;
}
