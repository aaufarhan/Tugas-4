// Kelas ini merepresentasikan faktur yang berisi informasi pembelian
// Kelas Faktur mewarisi dari kelas Barang (Inheritance)
public class Faktur extends Barang {
    private String noFaktur;
    private int jumlahBeli;
    
    // Konstruktor Faktur memanggil konstruktor Barang dengan keyword 'super' (Inheritance)
    public Faktur(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil konstruktor kelas dasar Barang
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
    }

    public double hitungTotal() {
        return getHargaBarang() * jumlahBeli; // Menghitung total harga
    }

    public void printFaktur() {
        System.out.println("No Faktur: " + noFaktur);
        System.out.println("Kode Barang: " + getKodeBarang());
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Harga Barang: Rp " + getHargaBarang());
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total: Rp " + hitungTotal());
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }
}
