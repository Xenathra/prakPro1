package pertemuan1;

public class Node {


	private int Nilai;
	private Node next;
	
	//inisialisasi Node
	public Node(int Nilai) {
		this.Nilai = Nilai;
	}
	
	//Setter & Getter
	public void setNext (Node n) {
		this.next = n;
	}
	/////////////////
	public int getNilai() {
		return this.Nilai;
	}
	
	public Node getNext() {
		return this.next;
	}

}