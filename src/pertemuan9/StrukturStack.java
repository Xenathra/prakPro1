package pertemuan9;

public class StrukturStack {

	private int capacity;
    private int[] array;
    private int top;

    // Konstruktor dengan satu parameter yaitu capacity
    public StrukturStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1; // Inisialisasi top dengan nilai -1 menandakan stack kosong
    }

    // Operasi push untuk menambahkan elemen ke dalam stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack penuh, tidak dapat menambahkan elemen baru.");
            return;
        }
        top++;
        array[top] = value;
        System.out.println("push " + value );
    }

    // Operasi pop untuk menghapus elemen teratas dari stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak dapat menghapus elemen.");
            return -1; // Mengembalikan nilai -1 sebagai penanda stack kosong
        }
        int removedValue = array[top];
        top--;
        System.out.println("Nilai " + removedValue + " berhasil dihapus dari stack.");
        return removedValue;
    }

    // Operasi isEmpty untuk mengecek apakah stack kosong atau tidak
    public boolean isEmpty() {
        return top == -1;
    }

    // Operasi isFull untuk mengecek apakah stack penuh atau tidak
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Operasi size untuk mengembalikan jumlah elemen dalam stack
    public int size() {
        return top + 1;
    }

    // Operasi top untuk mengembalikan nilai teratas dari stack tanpa menghapusnya
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak ada nilai teratas.");
            return -1; // Mengembalikan nilai -1 sebagai penanda stack kosong
        }
        return array[top];
    }
}
