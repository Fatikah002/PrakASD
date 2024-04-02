package P6.Hotel;

public class Hotel12 {
    String nama, kota;
    int harga ;
    byte bintang;

    public Hotel12(String n, String k, int h, byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    
    public void tampil(){
        System.out.println("================================");
        System.out.println("Nama hotel  : " + nama);
        System.out.println("Kota        : " + kota);
        System.out.println("Harga       : " + harga);
        System.out.println("Bintang     : " + bintang);
    }
}
