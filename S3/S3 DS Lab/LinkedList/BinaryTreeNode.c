#include <stdio.h>
#include <stdlib.h>

struct BinaryTreeNode {
    int data;
    struct BinaryTreeNode* left;
    struct BinaryTreeNode* right;
};

struct BinaryTreeNode* createNode(int data) {
    struct BinaryTreeNode* newNode = (struct BinaryTreeNode*)malloc(sizeof(struct BinaryTreeNode));
    if (newNode == NULL) {
        printf("Memory allocation failed!");
        return NULL;
    }
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

int main() {
    // Test the binary tree node implementation
    struct BinaryTreeNode* root = createNode(1);
    root->left = createNode(2);
    root->right = createNode(3);

    printf("Data in the root node: %d\n", root->data);
    printf("Data in the left child node: %d\n", root->left->data);
    printf("Data in the right child node: %d\n", root->right->data);

    return 0;
}
