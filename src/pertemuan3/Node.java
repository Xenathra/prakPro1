package pertemuan3;

public class Node {

	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public double getData() {
		return this.data;
	}
	public Node getNext() {
		return this.next;
	}
}
