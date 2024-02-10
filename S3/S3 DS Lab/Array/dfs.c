#include<stdio.h>
void dfs(int);
int V[10][10],visited[10],n;
int i,j;
void main()
{
    printf("enter the number of veritix");
    scanf("%d",&n);
    //enter the adjcent vertex of the code 
     printf("enter the adjcent vertex of the code ");
    for( i=0;i<n;i++)
    {
        for( j=1+i;j<n-1;j++)
        {
            scanf("%d",&V[i][j]);
        }
    }
    //make the entire visited into zero 
    for(i=0;i<n;i++)
    {
        visited[i]=0;
    }

    //call the dfs function
    dfs(0);
}
void dfs(int i)
{
    visited[i]=1;
    printf("%d",i);

    for(int j=0;j<n;j++)
    {
        if(V[i][j]==1 && !visited[j])
        {
            dfs(j);
        }
    }
}