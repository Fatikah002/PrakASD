package P6;
public class MainBuku12 {
    public static void main(String[] args) {

        DaftarBuku12 listBuku12 = new DaftarBuku12();

        Buku12 m = new Buku12(20215,"Algoritma" , 2019, "Wahyuni", 5);
        Buku12 m1 = new Buku12(20214, "Big Data", 2020, "Susilo", 3);
        Buku12 m2 = new Buku12(20212, "Desain UI", 2021, "Supriadi", 6);
        Buku12 m3 = new Buku12(20211, "Web Programming", 2022, "Pustaka Adi", 2);
        Buku12 m4 = new Buku12(20211, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);

        listBuku12.tambah(m);
        listBuku12.tambah(m1);
        listBuku12.tambah(m2);
        listBuku12.tambah(m3);
        listBuku12.tambah(m4);

        System.out.println("***********************");
        System.out.println("Data sebelum diurutkan");
        listBuku12.tampil();

        System.out.println("***********************");
        System.out.println("Data setelah diurutkan secara Asc berdasarkan stock");
        listBuku12.bubbleSort();
        listBuku12.tampil();

       

    }
}
