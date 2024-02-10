#include<stdio.h>
void main()
{
    int max=0,a[100],temp;
    printf("enter the size of the array");
    scanf("%d",max);
    for(int i=0;i<max;i++)
    {   scanf("%d",&a[i]);
    }
    //to sort
    for(int i=0;i<max;i++)
    {   
        for(int j=1;j<max;j++)
        {
           if (a[j] >a[j+1])
           {
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
           }
        }
        
    }
     
}