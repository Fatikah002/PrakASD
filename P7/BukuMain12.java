package P7;
import java.util.Scanner;
public class BukuMain12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s12 = new Scanner(System.in);

        PencarianBuku12 data = new PencarianBuku12();
        int jumBuku = 5;

        System.out.println("______________________________________________");
        System.out.println("Masukkan data Buku secara Urut dari kodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("_______________________");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku \t: ");
            String judulBuku = s12.nextLine();
            System.out.print("Tahun terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s12.nextLine();
            System.out.print("Stock     \t: ");
            int stock = s.nextInt();

            Buku12 m = new Buku12(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("______________________________________________");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("______________________________________________");
        System.out.println("______________________________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

    }
}
