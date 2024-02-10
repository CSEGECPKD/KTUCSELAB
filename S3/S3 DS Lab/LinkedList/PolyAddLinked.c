#include <stdio.h>
#include <stdlib.h>

// Structure to represent a term in the polynomial
struct Term {
    int coefficient;
    int exponent;
    struct Term* next;
};

// Function to create a new term with the given coefficient and exponent
struct Term* createTerm(int coefficient, int exponent) {
    struct Term* newTerm = (struct Term*)malloc(sizeof(struct Term));
    newTerm->coefficient = coefficient;
    newTerm->exponent = exponent;
    newTerm->next = NULL;
    return newTerm;
}

// Function to add a term to the polynomial
void addTerm(struct Term** poly, int coefficient, int exponent) {
    struct Term* newTerm = createTerm(coefficient, exponent);
    if (*poly == NULL) {
        *poly = newTerm;
    } else {
        struct Term* curr = *poly;
        while (curr->next != NULL) {
            curr = curr->next;
        }
        curr->next = newTerm;
    }
}

// Function to add two polynomials
struct Term* addPolynomials(struct Term* poly1, struct Term* poly2) {
    struct Term* result = NULL;
    struct Term* curr1 = poly1;
    struct Term* curr2 = poly2;

    while (curr1 != NULL && curr2 != NULL) {
        if (curr1->exponent > curr2->exponent) {
            addTerm(&result, curr1->coefficient, curr1->exponent);
            curr1 = curr1->next;
        } else if (curr1->exponent < curr2->exponent) {
            addTerm(&result, curr2->coefficient, curr2->exponent);
            curr2 = curr2->next;
        } else {
            int sum = curr1->coefficient + curr2->coefficient;
            if (sum != 0) {
                addTerm(&result, sum, curr1->exponent);
            }
            curr1 = curr1->next;
            curr2 = curr2->next;
        }
    }

    // Add remaining terms of poly1
    while (curr1 != NULL) {
        addTerm(&result, curr1->coefficient, curr1->exponent);
        curr1 = curr1->next;
    }

    // Add remaining terms of poly2
    while (curr2 != NULL) {
        addTerm(&result, curr2->coefficient, curr2->exponent);
        curr2 = curr2->next;
    }

    return result;
}

// Function to display the polynomial
void displayPolynomial(struct Term* poly) {
    struct Term* curr = poly;
    while (curr != NULL) {
        printf("%dx^%d ", curr->coefficient, curr->exponent);
        if (curr->next != NULL) {
            printf("+ ");
        }
        curr = curr->next;
    }
    printf("\n");
}

int main() {
    struct Term* poly1 = NULL;
    struct Term* poly2 = NULL;
    struct Term* result = NULL;

    // Add terms to poly1
    addTerm(&poly1, 5, 4);
    addTerm(&poly1, 3, 2);
    addTerm(&poly1, 2, 1);

    // Add terms to poly2
    addTerm(&poly2, 4, 3);
    addTerm(&poly2, 2, 2);
    addTerm(&poly2, 1, 0);

    // Add polynomials
    result = addPolynomials(poly1, poly2);

    // Display the polynomials
    printf("Polynomial 1: ");
    displayPolynomial(poly1);
    printf("Polynomial 2: ");
    displayPolynomial(poly2);
    printf("Sum: ");
    displayPolynomial(result);

    return 0;
}
