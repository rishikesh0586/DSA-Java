public class AdjMatrix {

        private int[][] adjacencyMatrix;
        private int vertices;
    
        // Constructor to initialize the graph with a given number of vertices
        public AdjMatrix (int vertices) {
            this.vertices = vertices;
            this.adjacencyMatrix = new int[vertices][vertices];
        }
    
        // Method to add an edge to the graph
        public void addEdge(int source, int destination) {
            // Assuming a simple, unweighted graph; if the graph is weighted, you can set the corresponding weight here
            adjacencyMatrix[source][destination] = 1;
            // If the graph is undirected, add the reverse edge
            adjacencyMatrix[destination][source] = 1;
        }
    
        // Method to print the adjacency matrix
        public void printGraph() {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    System.out.print(adjacencyMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            // Create a new graph with 5 vertices
            AdjMatrix  graph = new AdjMatrix (5);
    
            // Add edges to the graph
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(2, 4);
    
            // Print the adjacency matrix
            graph.printGraph();
        }
    }
    
