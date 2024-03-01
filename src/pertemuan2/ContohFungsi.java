package pertemuan2;

public class ContohFungsi {

	//sebuah fungsi yang berisi format untuk penjumlahan
	public static int tambah(int a, int b) {
		return a + b;
	}
	
	//sebuah fungsi yang berisi format untuk perkalian
	public static int kali(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		//pemanggilan fungsi penjumlahan dan menampilkan nya
		int hasilPenjumlahan = tambah(5, 3);
		System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
		
		//pemanggilan fungsi perkalian dan menampilkan nya
		int hasilPerkalian = kali(4,6);
		System.out.println("Hasil perkalian: " + hasilPerkalian);
		
	}
}
