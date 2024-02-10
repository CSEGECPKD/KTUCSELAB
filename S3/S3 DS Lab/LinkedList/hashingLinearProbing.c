#include <stdio.h>
#define SIZE 10

// Function to calculate the hash value
int hash(int key)
{
    return key % SIZE;
}

// Function to insert a key into the hash table
void insert(int hashTable[], int key)
{
    int index = hash(key); // Calculate the hash value

    // Linear probing
    while (hashTable[index] != -1) // If the slot is not empty
    {
        index = (index + 1) % SIZE; // Move to the next slot
    }

    hashTable[index] = key; // Insert the key into the hash table
}

// Function to search for a key in the hash table
int search(int hashTable[], int key)
{
    int index = hash(key); // Calculate the hash value

    // Linear probing
    while (hashTable[index] != key)
    {
        if (hashTable[index] == -1) // If the slot is empty
        {
            return -1; // Key not found
        }
        index = (index + 1) % SIZE; // Move to the next slot
    }

    return index; // Return the index where the key is found
}

// Function to display the hash table
void display(int hashTable[])
{
    printf("Hash Table:\n");
    for (int i = 0; i < SIZE; i++)
    {
        printf("%d: %d\n", i, hashTable[i]);
    }
}

int main()
{
    int hashTable[SIZE];

    // Initialize the hash table with -1 (empty slots)
    for (int i = 0; i < SIZE; i++)
    {
        hashTable[i] = -1;
    }

    // Insert keys into the hash table
    insert(hashTable, 5);
    insert(hashTable, 15);
    insert(hashTable, 25);
    insert(hashTable, 35);

    // Search for a key in the hash table
    int key = 25;
    int index = search(hashTable, key);
    if (index != -1)
    {
        printf("Key %d found at index %d\n", key, index);
    }
    else
    {
        printf("Key %d not found\n", key);
    }

    // Display the hash table
    display(hashTable);

    return 0;
}
