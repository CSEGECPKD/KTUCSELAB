/*
#include<stdio.h>
#include<stdlib.h>
#define size 10
int pqueue[100],front=-1;rear=-1;
void p_enqueue(int data)
{
    //checking the queue is full
    if((front==0) && (rear=size-1));
    {
        printf("the queue is overflow");
        return;
    }
    if (front==-1 && rear==-1)
    {
        front=0;
        rear=0;
        pqueue[rear]=data;
        return;
    }
    else
    {
        check_priority(data);

    }
    rear++;
}

void check_priority(int data)
{
    int i,j;
    for(i=0;i<=rear;i++)
    {
        if(data>=pqueue[i])
        {
            for(j=rear+1;j>i;j--)
            {
                pqueue[j]=pqueue[j-1];

            }
            pqueue[i]=data;
            return;
        }
    }
    pqueue[i]=data;
}
void delete(int data)
{
    if (front== -1 && rear==-1 )
    {
        printf("emptuy queue ");
        return;
    }
    for(int i=0;i<=rear;i++)
    {
        if(data == pqueue[i])
        {
            for(;i<rear;i++)
            {
                pqueue[i]=pqueue[i+1];
            }
        }
        pqueue[i]=-99;
        rear--;
        if (rear==-1)
        {
            front=-1;
            return;
        }
    }
    printf("the lement is not found ");
}

void diaplay()
{
    for(;front<=rear;front++)
    {
     printf("%d;pqueue[front")
    }
    */
#include <stdio.h>

#define MAX_SIZE 100

// Structure to represent a priority queue
typedef struct {
    int data[MAX_SIZE]; // Array to store the elements
    int size; // Current size of the priority queue
} PriorityQueue;

// Function to initialize the priority queue
void initialize(PriorityQueue* pq) {
    pq->size = 0; // Set the initial size to 0
}

// Function to check if the priority queue is empty
int isEmpty(PriorityQueue* pq) {
    return pq->size == 0; // Return 1 if size is 0, otherwise return 0
}

// Function to check if the priority queue is full
int isFull(PriorityQueue* pq) {
    return pq->size == MAX_SIZE; // Return 1 if size is equal to MAX_SIZE, otherwise return 0
}

// Function to insert an element into the priority queue
void insert(PriorityQueue* pq, int element) {
    if (isFull(pq)) {
        printf("Priority Queue is full. Cannot insert element.\n");
        return;
    }

    int i = pq->size - 1; // Start from the last element

    // Shift elements to the right until the correct position is found
    while (i >= 0 && pq->data[i] > element) {
        pq->data[i + 1] = pq->data[i];
        i--;
    }

    pq->data[i + 1] = element; // Insert the element at the correct position
    pq->size++; // Increment the size of the priority queue
}

// Function to remove the highest priority element from the priority queue
int removeHighestPriority(PriorityQueue* pq) {
    if (isEmpty(pq)) {
        printf("Priority Queue is empty. Cannot remove element.\n");
        return -1;
    }

    int highestPriorityIndex = 0; // Index of the highest priority element
    int i;

    // Find the index of the highest priority element
    for (i = 1; i < pq->size; i++) {
        if (pq->data[i] > pq->data[highestPriorityIndex]) {
            highestPriorityIndex = i;
        }
    }

    int highestPriorityElement = pq->data[highestPriorityIndex]; // Get the highest priority element

    // Shift elements to the left to fill the gap created by removing the highest priority element
    for (i = highestPriorityIndex; i < pq->size - 1; i++) {
        pq->data[i] = pq->data[i + 1];
    }

    pq->size--; // Decrement the size of the priority queue

    return highestPriorityElement; // Return the highest priority element
}

// Function to display the elements of the priority queue
void display(PriorityQueue* pq) {
    if (isEmpty(pq)) {
        printf("Priority Queue is empty.\n");
        return;
    }

    printf("Priority Queue elements: ");
    for (int i = 0; i < pq->size; i++) {
        printf("%d ", pq->data[i]);
    }
    printf("\n");
}

int main() {
    PriorityQueue pq;
    initialize(&pq);

    insert(&pq, 5);
    insert(&pq, 3);
    insert(&pq, 7);
    insert(&pq, 1);
    insert(&pq, 9);

    display(&pq);

    int highestPriorityElement = removeHighestPriority(&pq);
    printf("Removed highest priority element: %d\n", highestPriorityElement);

    display(&pq);

    return 0;
}