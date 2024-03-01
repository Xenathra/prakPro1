package pertemuan3;

public class StrukturList {

	Node HEAD;
	
	public StrukturList() {
		this.HEAD = null;
	}
	
	public void addTail(int	 data) {
		Node newNode = new Node(data);
		
		if (HEAD == null) {
			HEAD = newNode;
		} else {
			Node current = HEAD;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void displayList() {
		Node current = HEAD;
		while (current !=null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		StrukturList myList = new StrukturList();
		
		myList.addTail(3);
		myList.addTail(2);
		myList.addTail(1);
		myList.addTail(7);
		
		System.out.println("Linked list: ");
		myList.displayList();
		
	}
	
}
