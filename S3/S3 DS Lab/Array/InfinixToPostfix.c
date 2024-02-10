#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#define size 50

char stack[size]; // Stack to store operators
int top=-1; // Top of the stack

void push(char elem)
{
    stack[++top]=elem; // Push element onto the stack
}

char pop()
{
    return (stack[top--]); // Pop element from the stack
}

int pr(char elem)
{
    switch (elem)
    {
        case '#':
          return 0; // Lowest precedence
        case '(':
         return 1; // Precedence of '(' is higher than other operators
        case '+':
        case '-':
          return 2; // Precedence of '+' and '-' is lower than '*' and '/'
        case '*':
        case '/':
         return 3; // Precedence of '*' and '/' is higher than '+' and '-'
        case '^':
         return 4; // Precedence of '^' (exponentiation) is highest
    }
    return -1; // Invalid operator
}

void infix_to_postfix(char *infinix, char *postfix)
{
    char ch, elem;
    int i=0, k=0;
    push('#'); // Push '#' onto the stack

    while((ch=infinx[i++]) !='\0') // Loop through each character of the infix expression
    {
        if (ch=='(')
           push (ch); // Push '(' onto the stack
        else if (isalnum(ch))
         postfix[k++]=ch; // Append operand to the postfix expression
        else if (ch==')')
        {
            while(stack[top]!='(')
            {
                postfix[k++]=pop(); // Pop operators from the stack until '(' is encountered
            }
            elem=pop(); // Pop '(' from the stack
        
        }
        else 
        {
            while(pr(stack[top])>= pr(ch))
            {
                postfix[k++]=pop(); // Pop operators from the stack with higher or equal precedence
            }
            push(ch); // Push current operator onto the stack
        }
      
    }
    while(stack[top]!='#')
    {
        postfix[k++]=pop(); // Pop remaining operators from the stack
    }
    postfix[k]='\0'; // Add null terminator to the postfix expression
}

int eval_postfix(char *postfix)
{
    char ch;
    int t=0,op1,op2;
    while((ch=postfix[t++]!='\0')) // Loop through each character of the postfix expression
    {
        if(isdigit((ch)))
        {
            push(ch-'0'); // Push operand onto the stack
        }
        else{
            op2=pop(); // Pop second operand from the stack
            op1=pop(); // Pop first operand from the stack

            switch (ch)
            {
                case '+':
                push(op1 +op2); // Perform addition and push result onto the stack
                break;
                case '-':
                push(op1-op2); // Perform subtraction and push result onto the stack
                break;
                case '*':
                push(op1*op2); // Perform multiplication and push result onto the stack
                break;
                case '/':
                push(op1/op2); // Perform division and push result onto the stack
                break;
            }
        }
    }
    return pop(); // Return the final result from the stack
}