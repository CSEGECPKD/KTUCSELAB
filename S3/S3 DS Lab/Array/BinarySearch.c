#include<stdio.h>
void main()
{
    int a[10],max;
    printf("enter the size of array");
    scanf("%d",&max);
    
    for(int i=0;i<max;i++)
    {
        printf("enter the number");
        scanf("%d",&a[i]);
        
    }
    int k=0;
    printf("enter the number you want to search");
    scanf("%d",&k);
    int low=0,high=max-1,mid;
    mid=(high+low)/2;
    while(low>high)
    {
       if(a[mid]==k)
       {
        printf("the number has been founded");
        break;
       }
       if(k>mid)
       {
         low=mid+1;
       }
       if(mid<k)
       {
        high=mid-1;
       }
    }
    if(low>high)
    {
        printf("the number is not found ");
    }

}