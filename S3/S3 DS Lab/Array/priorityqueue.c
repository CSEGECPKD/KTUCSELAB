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
}