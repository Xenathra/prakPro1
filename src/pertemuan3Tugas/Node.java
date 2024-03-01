package pertemuan3Tugas;

public class Node {

	int data;
	Node next;
	
	//inisialisasi atribut node
	public Node(int data) {
		this.data = data;
	}
	//setter & getter
	public void setNext (Node n) {
		this.next = n;
	}
	
	public int getdata() {
		return this.data;
	}
	
	public Node getNext() {
		return this.next;
	}

	
}
