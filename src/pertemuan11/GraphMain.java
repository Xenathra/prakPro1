package pertemuan11;

public class GraphMain {
	public static void main(String[] args) {
		Graph graph = new Graph ();
		  graph.addVertex("A");
	      graph.addVertex("B");
	      graph.addVertex("C");
	      graph.addVertex("D");
	      graph.addVertex("E");

	      graph.addEdge("A", "C");
	      graph.addEdge("B", "B");
	      graph.addEdge("D", "B");
	      graph.addEdge("E", "C");
	      graph.addEdge("C", "B");
	      graph.addEdge("C", "C");
	      graph.addEdge("C", "D");
	      

	      graph.adjacencyMatrix();
	}

}
