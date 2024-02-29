package P2.penjualanBuku;

public class BukuMain12 {
    public static void main(String[] args) {
      
        Buku12 bk1 = new Buku12();
        bk1.judul = "How to Train Your Dragon";
        bk1.pengarang = "Cressida Cowell";
        bk1.halaman = 432;
        bk1.stok = 13;
        bk1.harga = 275000;

    
        bk1.tampilInformasi();
        bk1.terjual(12);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        

       
        Buku12 bk2= new Buku12();
        bk2.judul = "How to Train Your Dragon";
        bk2.pengarang = "Cressida Cowell";
        bk2.halaman = 432;
        bk2.stok = 0;
        bk2.harga = 275000;

        
        bk2.terjual(4);
        bk2.tampilInformasi();
    }
}
