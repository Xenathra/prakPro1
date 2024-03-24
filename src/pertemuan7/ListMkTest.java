package pertemuan7;

public class ListMkTest {
	
	    public static void main(String[] args) {
	        ListMk list = new ListMk();

	        // Tes-1: Menambahkan elemen di awal list dan menampilkan elemen
	        list.addHead(new Matakuliah("IF001", "Matematika Dasar", 4));
	        list.addHead(new Matakuliah("IF002", "Fisika Dasar", 3));
	        list.addHead(new Matakuliah("IF003", "Kimia Dasar", 3));
	        list.addHead(new Matakuliah("IF004", "Biologi Dasar", 3));

	        System.out.println("Tes-1 Output:");
	        list.displayElements();
	        System.out.println();

	        // Tes-2: Menambahkan elemen di akhir list
	        list.addTail(new Matakuliah("IF005", "Algoritma dan Pemrograman", 4));
	        System.out.println("Tes-2 Output (Setelah Menambahkan MK005):");
	        list.displayElements();
	        System.out.println();

	        // Tes-3: Menambahkan elemen di tengah list
	        list.addMid(new Matakuliah("IF006", "Basis Data", 3));
	        System.out.println("Tes-3 Output (Setelah Menambahkan MK006 di Tengah List):");
	        list.displayElements();
	        System.out.println();

	        // Tes-4 : Menampilkan seluruh elemen list
	        System.out.println("Tes-4 Output:");
	        list.displayElements();
	    
	    }
}
