#include <stdio.h>
#include <stdlib.h>

// Structure for a node in the binary tree
struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to perform inorder traversal of the binary tree
void inorderTraversal(struct Node* root) {
    if (root == NULL) {
        return;
    }

    struct Node* stack[100]; // Stack to store nodes
    int top = -1; // Top of the stack

    struct Node* current = root;

    while (current != NULL || top != -1) {
        // Reach the leftmost node of the current node
        while (current != NULL) {
            stack[++top] = current;
            current = current->left;
        }

        // Backtrack from the empty subtree and visit the node at the top of the stack
        current = stack[top--];
        printf("%d ", current->data);

        // Move to the right subtree
        current = current->right;
    }
}

int main() {
    // Create a sample binary tree
    struct Node* root = createNode(1);
    root->left = createNode(2);
    root->right = createNode(3);
    root->left->left = createNode(4);
    root->left->right = createNode(5);

    // Perform inorder traversal
    printf("Inorder traversal: ");
    inorderTraversal(root);

    return 0;
}
