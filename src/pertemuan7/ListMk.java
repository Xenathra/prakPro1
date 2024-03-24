package pertemuan7;

public class ListMk {

    private Node head;
    private Node tail;

    public ListMk() {
        this.head = null;
    }

    // Operasi menambah elemen di awal list
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Operasi menampilkan elemen list
    public void displayElements() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    // Operasi menambah elemen di akhir list
    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

 // Operasi menambah elemen di tengah list
    public void addMid(Matakuliah data) {
        // Implementasi tambahan untuk menambahkan di tengah list
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (head.next == null) {
            newNode.next = head.next;
            head.next = newNode;
            tail = newNode;
        } else {
            Node current = head;
            Node prev = null;
            int count = 0;
            while (current != null && count < size() / 2) {
                prev = current;
                current = current.next;
                count++;
            }
            prev.next = newNode;
            newNode.next = current;
        }
    }

 // Operasi untuk mendapatkan jumlah elemen dalam list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
