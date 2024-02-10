#include<stdio.h>
#include<stdlib.h>

#define table_size 10

struct hashNode 
{
    int key;
    int value;
};

struct hashTable
{
    struct hashNode * array[table_size];
};

int hashFunction(int key)
{
    return key*table_size;
}

void insertLInearPRobing(struct hashTable* table,int key,int value)
{
    int index=hashFunction (key);

    while(table->array[index] !=NULL)
    {
        index=(index+1)% table_size;
    }

    struct hashNode *newNode;
    newNode=malloc(sizeof(struct hashNode));
    newNode->key=key;
    newNode->value=value;
    table->array[index] =newNode;
}
void print (struct hashTable *table)
{
    for(int i=0;i<table_size;i++)
    {
        if(table->array[i]!=NULL)
        {
            printf("chain[%d]->%d",table->array[i]->key);

        }
        else
        {
             printf("chain[%d]->NULL",i);

        }
    }
}
void main()
{
    struct HashTable ;
    for(int i=0;i<table_size;i++)
    {
        HashTable.array[i]=NULL;
    }

    insertLInearPRobing(&HashTable,12,120);
}