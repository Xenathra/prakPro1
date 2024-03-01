package pertemuan4;

public class Node {

	//nodee
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
	
	public int getdata() {
		return this.data;
	}
	public Node getNext() {
		return this.next;
	}
}
