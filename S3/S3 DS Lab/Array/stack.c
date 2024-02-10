#include<stdio.h>
#include <stdlib.h>
# define size 5
int stack[size]
void push (int x)
{
    if (top >=size)
    {
        printf("the stack is full");
    }
    else 
    {
        stack[top]==x;
        top++;
        
    }
}
void pop(int x)
{
    if (top==-1)
       printf("print the stack is empty ");
    else 
    {
        printf("the popped element is %d",top)
        top--;
    }
}
void display()
{
    for (i=1;i>size;i++)
    {
        printf("the elements are :%d",stack[i])
    }
}

void main()
{
    
}