package pertemuan11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
	 private ArrayList<Vertex> vertices;
	 private Map<String, ArrayList<String>> adjacencyList;
    
    public Graph() {
        vertices = new ArrayList<>();
        adjacencyList = new HashMap<>();
    }

    public void addVertex(String name) {
        Vertex vertex = new Vertex(name);
        vertices.add(vertex);
        adjacencyList.put(name, new ArrayList<>());
    }

    public void addEdge(String start, String end) {
        if (adjacencyList.containsKey(start) && adjacencyList.containsKey(end)) {
            adjacencyList.get(start).add(end);
            adjacencyList.get(end).add(start);  // Assuming it's an undirected graph
        } else {
            System.out.println("One or both vertices not found");
        }
    }

    public void adjacencyMatrix() {
        int size = vertices.size();
        int[][] matrix = new int[size][size];
        Map<String, Integer> vertexIndexMap = new HashMap<>();
        
        for (int i = 0; i < size; i++) {
            vertexIndexMap.put(vertices.get(i).getName(), i);
        }

        for (int i = 0; i < size; i++) {
            String vertex = vertices.get(i).getName();
            for (String adjacent : adjacencyList.get(vertex)) {
                int j = vertexIndexMap.get(adjacent);
                matrix[i][j] = 1;
            }
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
