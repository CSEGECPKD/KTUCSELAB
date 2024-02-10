/*

#include<stdio.h>

void dfs(int);
int V[10][10], visited[10], n;
int i, j;

void main()
{
    printf("Enter the number of vertices: ");
    scanf("%d", &n);

    printf("Enter the adjacency matrix: \n");
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            scanf("%d", &V[i][j]);
        }
    }

    // Initialize visited array with zeros
    for(i = 0; i < n; i++)
    {
        visited[i] = 0;
    }

    printf("DFS traversal starting from vertex 0: ");
    dfs(0);
}

void dfs(int i)
{
    visited[i] = 1; // Mark the current vertex as visited
    printf("%d ", i); // Print the current vertex

    for(int j = 0; j < n; j++)
    {
        // Check if there is an edge from the current vertex to the next vertex
        // and if the next vertex is not visited
        if(V[i][j] == 1 && !visited[j])
        {
            dfs(j); // Recursively call dfs for the next vertex
        }
    }
    */
#include <stdio.h>
#include <stdbool.h>

#define MAX_SIZE 100

// Stack implementation
typedef struct {
    int arr[MAX_SIZE];
    int top;
} Stack;

void initialize(Stack* stack) {
    stack->top = -1;
}

bool isEmpty(Stack* stack) {
    return stack->top == -1;
}

bool isFull(Stack* stack) {
    return stack->top == MAX_SIZE - 1;
}

void push(Stack* stack, int data) {
    if (isFull(stack)) {
        printf("Stack Overflow\n");
        return;
    }
    stack->arr[++stack->top] = data;
}

int pop(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack Underflow\n");
        return -1;
    }
    return stack->arr[stack->top--];
}

int peek(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack is empty\n");
        return -1;
    }
    return stack->arr[stack->top];
}

// Depth First Search implementation
void dfs(int graph[][MAX_SIZE], int start, int numVertices) {
    Stack stack;
    initialize(&stack);
    bool visited[MAX_SIZE] = { false };

    push(&stack, start);
    visited[start] = true;

    printf("DFS traversal: ");

    while (!isEmpty(&stack)) {
        int current = pop(&stack);
        printf("%d ", current);

        for (int i = 0; i < numVertices; i++) {
            if (graph[current][i] == 1 && !visited[i]) {
                push(&stack, i);
                visited[i] = true;
            }
        }
    }
}

int main() {
    int numVertices;
    printf("Enter the number of vertices: ");
    scanf("%d", &numVertices);

    int graph[MAX_SIZE][MAX_SIZE];
    printf("Enter the adjacency matrix:\n");
    for (int i = 0; i < numVertices; i++) {
        for (int j = 0; j < numVertices; j++) {
            scanf("%d", &graph[i][j]);
        }
    }

    int startVertex;
    printf("Enter the starting vertex: ");
    scanf("%d", &startVertex);

    dfs(graph, startVertex, numVertices);

    return 0;
}