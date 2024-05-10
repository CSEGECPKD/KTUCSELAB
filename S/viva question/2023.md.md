Ds viva
Q)What is boundary graph,connected graph,disconnected graph
A)In graph theory, a graph is a collection of nodes (or vertices) and edges that connect these nodes. Here are the definitions of connected and disconnected graphs:

1)Connected Graph: A graph is said to be connected if there is a path from any point to any other point in the graph. In other words, you can reach any vertex from any other vertex in the graph through the graph's edges.

2)Disconnected Graph: A graph is said to be disconnected if it is not connected, meaning there is at least one pair of vertices that are not connected by a path. Disconnected graphs can be broken down into several connected components, which are subgraphs that are themselves connected.




Q)Difference in between Clustering and Loadfactor
A)Clustering is a concept from the field of data analysis and machine learning. It refers to the task of grouping a set of objects in such a way that objects in the same group (called a cluster) are more similar to each other than to those in other groups (clusters). It's a method of unsupervised learning and a common technique for statistical data analysis used in many fields.

Load Factor is a concept from the field of computer science, specifically in the context of hash tables. The load factor of a hash table is the number of entries divided by the number of buckets (array size). The load factor is a measure of how full the hash table is. A higher load factor means the hash table is more full, which can lead to higher collision rates. When the load factor reaches a certain threshold (typically around 0.7), it's common to resize the hash table to reduce the risk of collisions and maintain efficient performance.



Q)Time complexity 
A)Time complexity is a concept in computer science that describes the amount of time an algorithm takes to run as a function of the size of its input. It's usually expressed using Big O notation, which describes the upper bound of the time complexity in the worst-case scenario.

Q)Open addressing and separate chaining
A)Open Addressing: In open addressing, if a collision occurs, we look for other places in the table to insert the item (like the next empty slot). This is done using a process called "probing", which can be linear (check the next slot), quadratic (check the slots by moving 1, 4, 9, 16... slots), or double hashing (use another hash function to decide the next slot). The main advantage of open addressing is that it makes efficient use of memory. However, it can suffer from clustering, where a sequence of slots becomes occupied, slowing down the search time.

Separate Chaining: In separate chaining, each bucket in the hash table's internal array is independent, and has some sort of list of entries with the same hash index. This can be any data structure that supports efficient insertion and deletion, typically a linked list. The main advantage of separate chaining is that it handles high load factors better than open addressing. However, it requires more memory because of the additional linked list pointers.




Q)What is tree,graph,adjacency Matrix , adjacency list
A)
Tree: A tree is a hierarchical data structure that consists of nodes connected by edges. Each tree has a root node (the top node), and each node can have child nodes. Importantly, there are no cycles in a tree.

Graph: A graph is a collection of nodes (or vertices) and edges that connect these nodes. Unlike trees, graphs can have cycles. Graphs can be either directed (edges have a direction) or undirected (edges do not have a direction).

Adjacency Matrix: An adjacency matrix is a 2D array used to represent a finite graph. The elements of the matrix indicate whether pairs of vertices are adjacent or not in the graph. In the adjacency matrix, the rows and columns are ordered according to the nodes involved.

Adjacency List: An adjacency list is another way to represent a graph. Each node has a list of which nodes it is connected to. Nodes that are connected by an edge are said to be 'adjacent'. This representation is more space-efficient than the adjacency matrix for sparse graphs (where most pairs of nodes are not connected by an edge).

