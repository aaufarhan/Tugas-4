// Kelas ini merepresentasikan faktur yang berisi informasi pembelian
public class Faktur {
    private String noFaktur;
    private Barang barang;
    private int jumlahBeli;

    public Faktur(String noFaktur, Barang barang, int jumlahBeli) {
        this.noFaktur = noFaktur;
        this.barang = barang;
        this.jumlahBeli = jumlahBeli;
    }

    public double hitungTotal() {
        return barang.getHargaBarang() * jumlahBeli;
    }

    public void printFaktur() {
        System.out.println("No Faktur: " + noFaktur);
        System.out.println("Kode Barang: " + barang.getKodeBarang());
        System.out.println("Nama Barang: " + barang.getNamaBarang());
        System.out.println("Harga Barang: Rp " + barang.getHargaBarang());
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total: Rp " + hitungTotal());
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }
}