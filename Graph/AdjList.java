import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjList {
    // Using a Map to represent the adjacency list
    private Map<Integer, List<Integer>> adjacencyList;

    // Constructor to initialize the graph
    public AdjList() {
        adjacencyList = new HashMap<>();
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        // Add the destination to the list of neighbors for the source vertex
        adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);

        // If the graph is undirected, add the source to the list of neighbors for the destination vertex
        // Comment out this part if the graph is directed
        //adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    // Method to print the adjacency list representation of the graph
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            int vertex = entry.getKey();
            List<Integer> neighbors = entry.getValue();

            System.out.print("Vertex " + vertex + " is connected to: ");
            for (int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a new graph
        AdjList graph = new AdjList();

        // Add edges to the graph
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        // Print the adjacency list representation of the graph
        graph.printGraph();
    }
}
