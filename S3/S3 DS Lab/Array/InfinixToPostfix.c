#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#define size 50

char stack[size];
int top=-1;
void push(char elem)
{
    stack[++top]=elem;
}
char pop()
{
    return (stack[top--]);

}
int pr(char elem)
{
    switch (elem)
    {
        case '#':
          return 0;
        case '(':
         return 1;
        case '+':
        case '-':
          return 2;
        case '*':
        case '/':
         return 3;
        case '^':
         return 4;
    }
    return -1;
}

void infix_to_postfix(char *infinix, char *postfix)
{
    char ch, elem;
    int i=0, k=0;
    push('#');

    while((ch=infinx[i++]) !='\0')
    {
        if (ch=='(')
           push (ch);
        else if (isalnum(ch))
         postfix[k++]=ch;
        else if (ch==')')
        {
            while(stack[top]!='(')
            {
                postfix[k++]=pop();
            }
            elem=pop();
        
        }
        else 
        {
            while(pr(stack[top])>= pr(ch))
            {
                postfix[k++]=pop();

            }
            push(ch);
        }
      
    }
    while(stack[top]!='#')
    {
        postfix[k++]=pop();
    }
    postfix[k]='\0';
}

int eval_postfix(char *postfix)
{
    char ch;
    int t=0,op1,op2;
    while((ch=postfix[t++]!='\0'))
    {
        if(isdigit((ch)))
        {
            push(ch-'0');
        }
        else{
            op2=pop();
            op1=pop();

            switch (ch)
            {
                case '+':
                push(op1 +op2);
                break;
                case '-':
                push(op1-op2);
                break;
                case '*':
                push(op1*op2);
                break;
                case '/':
                push(op1/op2);
                break;
            }
        }
    }
    return pop();
}