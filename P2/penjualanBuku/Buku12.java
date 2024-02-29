package P2.penjualanBuku;


public class Buku12 {

    String judul, pengarang;
    int halaman, stok, harga;

    public Buku12(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual (int jml){
        if (stok > 0 && jml <= stok) {
            stok -= jml;
            if (stok == 0) {
                System.out.println("stok buku habis");
            }
        }else {
            System.out.println("\nStok buku habis");
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }

    void hitungHargaTotal(int terbeli){
        int hargaTotal = terbeli * harga;
        System.out.println("Total harga: " + hargaTotal);
    }
    
    void hitungDiskon(int terbeli){
        int hargaTotal = terbeli * harga;
        double diskon = 0;

        if (hargaTotal > 150000) {
            diskon = 0.12;
        } else if (hargaTotal >= 75000) {
            diskon = 0.05;
        }
        double totalDiskon = hargaTotal * diskon;
        System.out.println("Diskon: Rp " + totalDiskon);
    }
    void hitungHargaBayar(int terbeli){
        int hargaTotal = terbeli * harga;
        double diskon = 0;

        if (hargaTotal > 150000) {
            diskon = 0.15;
        } else if (hargaTotal >= 75000) {
            diskon = 0.05;
        }

        double totalDiskon = hargaTotal * diskon;
        double hargaBayar = hargaTotal - totalDiskon;
        System.out.println("Harga Bayar: Rp " + hargaBayar);
    }
}