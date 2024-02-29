package P2.penjualanBuku;

public class BukuMain12 {
    public static void main(String[] args) {
      
        Buku12 bk1 = new Buku12("Today Ends Tomorrow Comes", "Denada Pratiwi", 198, 13, 71000);
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        Buku12 bk2 = new Buku12("How to Train Your Dragon", "Cressida Cowell", 432, 0, 275000);
        bk2.terjual(4);
        bk2.tampilInformasi();

        Buku12 bukuFatikah = new Buku12("pergi", "Fatikah Salsabilla",312, 5, 80000);
        bukuFatikah.terjual(2);
        bukuFatikah.tampilInformasi();
    }
}
