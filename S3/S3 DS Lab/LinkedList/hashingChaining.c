#include<stdio.h>
#include<stdlib.h>
#define size 10

struct node 
{
    int data;
    struct node *next ;
};

//telling the no of chain 
struct node *chain[size];
//initalizing making the entore chain into zeros 
void init()
{
    for(int i=0;i<size;i++)
    {
        chain[i]=0;
    }
}

void insert(int value)
{
    
    struct node *newNode;
    newNode=malloc(sizeof(struct node));
    // printf("enter the value");
    scanf("%d",&value);
    newNode->data=value;
    newNode->next=NULL;
    int key=value % size;
    if(chain[key]==NULL)
    {
        chain[key]=newNode;
    }
    else
    {
        //if there are collosion we store them in th node connceting to a index
        struct node *temp=chain[key];
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=newNode;

    }
}

void print()
{
    int i=0;
    for (i=0;i<size;i++)
    {
        struct node *temp =chain[i];
        printf("chain[%d]",i);
        while(temp!=NULL)
        {
            printf("%d",temp->data);
           temp=temp->next;
            
        }
        printf("\n");

    }
}

void main()\
{
    init();
    insert(10);
}