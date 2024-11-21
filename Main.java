import java.util.Scanner;

// Kelas ini adalah kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input No Faktur
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            // Input Kode Barang
            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            // Input Nama Barang
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            // Input Harga Barang
            System.out.print("Masukkan Harga Barang: Rp ");
            double hargaBarang = scanner.nextDouble();

            // Input Jumlah Beli
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Validasi input
            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0.");
            }

            // Membuat objek Faktur
            Faktur faktur = new Faktur(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan detail pembelian barang
            System.out.println("~~~~Detail Pembelian Barang~~~~");
            faktur.printFaktur();

        } catch (IllegalArgumentException e) {
            // Menangani exception jika jumlah beli tidak valid
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Menangani exception lain yang tidak terduga
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
