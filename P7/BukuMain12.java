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
        Buku12 m = new Buku12("111","Algoritma" , 2019, "Wahyuni", 5);
        Buku12 m1 = new Buku12("123", "Big Data", 2020, "Susilo", 3);
        Buku12 m2 = new Buku12("125", "Desain UI", 2021, "Supriadi", 3);
        Buku12 m3 = new Buku12("126", "Web Programming", 2022, "Pustaka Adi", 2);
        Buku12 m4 = new Buku12("127", "Etika Mahasiswa", 2023, "Darmawan Adi", 2);
        
        data.tambah(m);
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);
        data.bubbleSortJudul();

        System.out.println("______________________________________________");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("______________________________________________");
        System.out.println("______________________________________________");
        System.out.println("Pencarian Data: ");
        // System.out.println("Masukkan Kode Buku yang dicari: ");
        // System.out.print("Kode Buku : ");
        // String cari = s.nextLine();
        // System.out.println("menggunakan sequential Search");
        // Buku12 bukuDitemukan = data.findBuku(cari);
        // int posisi = data.findSeqSearch(cari);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);
        
        // if (bukuDitemukan != null) {
        //     bukuDitemukan.tampilDataBuku();
        // } 

        // System. out. println("=============================");
        // System.out.println("menggunakan binary Search");
        // posisi = data.findBinarySearch(cari, 0, jumBuku - 1);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);

        System.out.println("Masukkan Judul Buku yang dicari: ");
        System.out.print("Judul Buku : ");
        String cari = s.nextLine();

        System.out.println("menggunakan sequential Search");
        int posisi = data.findSeqSearchJudul(cari);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("=============================");
        System.out.println("menggunakan binary Search");
        posisi = data.findBinarySearchJudul(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);


    }
}
