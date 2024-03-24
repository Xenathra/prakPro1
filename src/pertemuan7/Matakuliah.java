package pertemuan7;

public class Matakuliah {
    String kode;
    String nama;
    int jumlahSks;

    public Matakuliah(String kode, String nama, int jumlahSks) {
        this.kode = kode;
        this.nama = nama;
        this.jumlahSks = jumlahSks;
    }

    @Override
    public String toString() {
        return "[" + kode + ", " + nama + ", " + jumlahSks + " SKS]";
    }

}
