package pertemuan5;

//REMOVE MID
public class OperasiMid {

	    private Node HEAD;

	    public OperasiMid() {
	        this.HEAD = null;
	    }

	    // Fungsi untuk menambahkan elemen di awal
	    public void addHead(int data) {
	        Node newNode = new Node(data);
	        newNode.next = HEAD;
	        HEAD = newNode;
	    }

	    // Fungsi untuk menghapus elemen di awal
	    public void removeHead() {
	        if (HEAD != null) {
	            HEAD = HEAD.next;
	        } else {
	            System.out.println("List is empty. Cannot remove from an empty list.");
	        }
	    }

	    // Fungsi untuk menampilkan isi list
	    public void displayList() {
	        Node current = HEAD;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        OperasiMid myList = new OperasiMid();

	        myList.addHead(1);
	        myList.addHead(2);
	        myList.addHead(3);
	        myList.addHead(6);
	        myList.addHead(2);
	        
	        System.out.println("List before removal:");
	        myList.displayList();
	        
	        myList.removeHead();
	        myList.removeHead();
	        myList.removeHead();

	        
	        System.out.println("List after removal:");
	        myList.displayList();
	    }
	}

