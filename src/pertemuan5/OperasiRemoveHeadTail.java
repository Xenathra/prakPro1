package pertemuan5;

public class OperasiRemoveHeadTail {

	private Node HEAD;

    public OperasiRemoveHeadTail() {
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
            Node temp = HEAD;
            HEAD = HEAD.next;
            dispose(temp);
        } else {
            System.out.println("List is empty. Cannot remove from an empty list.");
        }
    }
    
 // Fungsi untuk menghapus elemen di akhir
    public void removeTail() {
        if (HEAD != null) {
            if (HEAD.next == null) {
                // Jika hanya ada satu elemen di list
                dispose(HEAD);
                HEAD = null;
            } else {
                Node current = HEAD;
                Node previous = null;

                while (current.next != null) {
                    previous = current;
                    current = current.next;
                }

                // Hapus elemen terakhir
                dispose(current);
                previous.next = null;
            }
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

    // Fungsi untuk membuang referensi ke node yang dihapus
    private void dispose(Node temp) {
        temp.next = null;
        temp = null;
    }
    public static void main(String[] args) {
        OperasiRemoveHeadTail myList = new OperasiRemoveHeadTail();

        // Menambahkan elemen ke list dan menampilkannya
        myList.addHead(1);
        myList.addHead(5);
        myList.addHead(3);
        myList.addHead(6);
        myList.addHead(2);
        
        System.out.println("List before removal:");
        myList.displayList();

        // Menghapus elemen pertama & terakhir dan menampilkannya kembali
        myList.removeHead();
        myList.removeTail();

        System.out.println("List after removal:");
        myList.displayList();
    }
}

