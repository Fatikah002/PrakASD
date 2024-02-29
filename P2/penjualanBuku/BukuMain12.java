package P2.penjualanBuku;

public class BukuMain12 {
    public static void main(String[] args) {
        Buku12 bk1 = new Buku12();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();  
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
     
    }
}
