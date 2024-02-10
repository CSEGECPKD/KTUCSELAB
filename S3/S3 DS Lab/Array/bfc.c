#include<stdio.h>
void bfs(int);
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
        for( j=0;j<n;j++)
        {
            scanf("%d",&V[i][j]);
        }
    }

    //display
    for( i=0;i<n;i++)
    {
        for( j=0;j<n;j++)
        {
            printf("%d",V[i][j]);
        }
    }
    //make the entire visited into zero 
    for(i=0;i<n;i++)
    {
        visited[i]=0;
    }

    bfs(0);
}
void bfs(int start)
{
    //using queue to store items
    int queue[10],front=-1,rear=-1;
    //increasing the rear meaning we have visited it 
    queue[rear++]=start;
    visited[start]=1;

    while(front!=rear)
    {
        //basically popping the visited array
        int current=queue[front++];
        printf("the cureent matrix is %d",&current);

        //to check if the adjacent are visited or not 
        for(i=0;i<n;i++)
        {
            if(V[current][j]==1 && !visited[j])
            {
                queue[rear++]=i;
                visited[i]=0;
            }

        }
    }

}