import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Edge class representing an edge between two vertices
class Edge {
    int source;
    int destination;

    public Edge(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }
}

// Graph class using an ArrayList of Edge objects
public class Graph {
    private ArrayList<Edge> edges;

    // Constructor to initialize the graph
    public Graph() {
        edges = new ArrayList<>();
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        Edge edge = new Edge(source, destination);
        edges.add(edge);

        // If the graph is undirected, add the reverse edge
        Edge reverseEdge = new Edge(destination, source);
        edges.add(reverseEdge);
    }

    // Method to perform Breadth-First Search (BFS)
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[edges.size()]; // Mark all vertices as not visited

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex] = true;

        System.out.println("BFS starting from vertex " + startVertex + ":");
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (Edge edge : edges) {
                if (edge.source == currentVertex && !visited[edge.destination]) {
                    queue.add(edge.destination);
                    visited[edge.destination] = true;
                }
            }
        }
        System.out.println();
    }

    // Method to perform Depth-First Search (DFS)
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[edges.size()]; // Mark all vertices as not visited
        dfsRecursive(startVertex, visited);
        System.out.println();
    }

    // Recursive helper method for Depth-First Search
    private void dfsRecursive(int currentVertex, boolean[] visited) {
        System.out.print(currentVertex + " ");
        visited[currentVertex] = true;

        for (Edge edge : edges) {
            if (edge.source == currentVertex && !visited[edge.destination]) {
                dfsRecursive(edge.destination, visited);
            }
        }
    }

    // Method to print the graph
    public void printGraph() {
        for (Edge edge : edges) {
            System.out.println("Edge: (" + edge.source + ", " + edge.destination + ")");
        }
    }

    public static void main(String[] args) {
        // Create a new graph
        Graph graph = new Graph();

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        // Print the graph
        graph.printGraph();

        // Perform BFS starting from vertex 0
        graph.bfs(0);

        // Perform DFS starting from vertex 0
        graph.dfs(0);
    }
}
