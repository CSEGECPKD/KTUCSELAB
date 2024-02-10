/*
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
*/
#include <stdio.h>
#include <stdbool.h>

#define MAX_SIZE 100

// Queue data structure for BFS
typedef struct {
    int items[MAX_SIZE];
    int front;
    int rear;
} Queue;

// Graph data structure
typedef struct {
    int vertices[MAX_SIZE][MAX_SIZE];
    bool visited[MAX_SIZE];
    int numVertices;
} Graph;

// Function to create a new queue
Queue* createQueue() {
    Queue* queue = (Queue*)malloc(sizeof(Queue));
    queue->front = -1;
    queue->rear = -1;
    return queue;
}

// Function to check if the queue is empty
bool isEmpty(Queue* queue) {
    if (queue->rear == -1)
        return true;
    else
        return false;
}

// Function to enqueue an element
void enqueue(Queue* queue, int value) {
    if (queue->rear == MAX_SIZE - 1)
        printf("Queue is full\n");
    else {
        if (queue->front == -1)
            queue->front = 0;
        queue->rear++;
        queue->items[queue->rear] = value;
    }
}

// Function to dequeue an element
int dequeue(Queue* queue) {
    int item;
    if (isEmpty(queue)) {
        printf("Queue is empty\n");
        item = -1;
    } else {
        item = queue->items[queue->front];
        queue->front++;
        if (queue->front > queue->rear) {
            queue->front = -1;
            queue->rear = -1;
        }
    }
    return item;
}

// Function to create a graph
void createGraph(Graph* graph, int numVertices) {
    graph->numVertices = numVertices;
    for (int i = 0; i < numVertices; i++) {
        graph->visited[i] = false;
        for (int j = 0; j < numVertices; j++)
            graph->vertices[i][j] = 0;
    }
}

// Function to add an edge to the graph
void addEdge(Graph* graph, int src, int dest) {
    graph->vertices[src][dest] = 1;
    graph->vertices[dest][src] = 1;
}

// Function to perform breadth-first search
void BFS(Graph* graph, int startVertex) {
    Queue* queue = createQueue();
    graph->visited[startVertex] = true;
    printf("Visited vertex: %d\n", startVertex);
    enqueue(queue, startVertex);

    while (!isEmpty(queue)) {
        int currentVertex = dequeue(queue);

        // Visit all adjacent vertices of the current vertex
        for (int i = 0; i < graph->numVertices; i++) {
            if (graph->vertices[currentVertex][i] == 1 && !graph->visited[i]) {
                graph->visited[i] = true;
                printf("Visited vertex: %d\n", i);
                enqueue(queue, i);
            }
        }
    }
}

int main() {
    Graph graph;
    int numVertices, startVertex;

    printf("Enter the number of vertices: ");
    scanf("%d", &numVertices);

    createGraph(&graph, numVertices);

    int src, dest;
    while (true) {
        printf("Enter edge (-1 -1 to exit): ");
        scanf("%d %d", &src, &dest);
        if (src == -1 && dest == -1)
            break;
        addEdge(&graph, src, dest);
    }

    printf("Enter the starting vertex: ");
    scanf("%d", &startVertex);

    printf("Breadth First Traversal:\n");
    BFS(&graph, startVertex);

    return 0;
}