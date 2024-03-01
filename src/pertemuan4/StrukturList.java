package pertemuan4;

public class StrukturList {

	Node head;
	
	public StrukturList() {
		this.head = null;
	}
	
	public void addMid(int nodeData, int index) {
		if (index < 0) {
			System.out.println("indeks tidak valid, tidak dapat menambahkan element");
			return;
		}
		
		Node newNode = new Node(nodeData); 
		if (index == 0 || head == null) {
			newNode.next = head;
			head = newNode;
		}else {
			Node current = head;
			for (int i = 0; i < index - 1 && current.next != null; i++) {
				current = current.next;
			}
			
			newNode.next = current.next;
			current.next = newNode;
		}
		
		System.out.println("Node" + nodeData + "berhasil ditambahkan pada indeks" + index + ".");
	}
	
	public static void main(String[] args) {
		StrukturList myStrukturList = new StrukturList();
		
		 myStrukturList.addMid(3, 0);
		 myStrukturList.addMid(4, 1);
		 myStrukturList.addMid(2, 2);
		 myStrukturList.addMid(1, 3);
		 myStrukturList.addMid(1, 4);
		 myStrukturList.addMid(1, 5);
		 myStrukturList.addMid(4, 6);
		 myStrukturList.addMid(5, 7);
		 myStrukturList.addMid(5, 8);

        // Menampilkan hasill
        myStrukturList.displayList();
	}
	
	public void displayList() {
		Node current = head;
		while ( current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}
