package pertemuan11;

public class Vertex {
	String name;
    boolean visited;

    public Vertex(String name) {
        this.name = name;
        this.visited = false;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
