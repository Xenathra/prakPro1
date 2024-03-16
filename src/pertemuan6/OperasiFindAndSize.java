package pertemuan6;

public class OperasiFindAndSize {
	Node HEAD;
	
	public OperasiFindAndSize() {
		this.HEAD = null;
	}
	
	//method untuk menambahkan elemen di akhir list
	public void add(int data) {
		Node newNode = new Node(data);
		if (HEAD == null)	{
			HEAD = newNode;
			return;
		}
		
		Node temp = HEAD;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	//method untuk menampilkan elemen list
	public void display() {
		Node temp = HEAD;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	//method untuk mencari elemen di dalam list
	public boolean find(int key) {
		Node temp = HEAD;
		while (temp != null) {
			if (temp.data == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	//method untuk menghapus semua elemen list
	public void removeAll() {
		HEAD = null;
	}

	//methos unduk menghitung jumlah elemen dalam list
	public int size() {
		int count = 0 ;
		Node temp = HEAD;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	//test
	public static void main(String[] args) {
		//latihan 2
			OperasiFindAndSize list = new OperasiFindAndSize();
			list.add(5);
		    list.add(4);
		    list.add(6);
		    list.display();
		    System.out.println(list.find(6));
		    
		    System.out.println();
		    
		//latihan 4
		    OperasiFindAndSize list2 = new OperasiFindAndSize();
		    list2.add(7);
	        list2.add(6);
	        list2.add(4);
	        list2.add(2);
	        list2.add(3);
	        list2.display();
	        System.out.println(list2.size());
	        
	        System.out.println();
	        
	    //tugas
	        OperasiFindAndSize list3 = new OperasiFindAndSize();
	        list3.add(4);
	        list3.add(3);
	        list3.add(7);
	        list3.add(8);
	        list3.add(1);
	        list3.add(9);
	        list3.display();
	        list3.removeAll();
	        list3.display();
	}
	
}
