package Kuis1_12_1C_FatikahSalsabilla;

public class Book12 {
    String kodeBuku;
    String judulBuku;
    String pengarang;
    int tahunTerbit;
    int stock;
  

   public Book12(String kodeBuku, String judulBuku, String pengarang, int tahunTerbit, int stock) {
      this.kodeBuku = kodeBuku;
      this.judulBuku = judulBuku;
      this.pengarang = pengarang;
      this.tahunTerbit = tahunTerbit;
      this.stock = stock;}

   public void displayInfo(){
    System.out.println("================");
    System.out.println("Kode buku : " + kodeBuku);
    System.out.println("Judul Buku : " + judulBuku);
    System.out.println("Pengarang : " + pengarang);
    System.out.println("Tahun terbit : " + tahunTerbit);
    System.err.println("Stock :"  + stock);
   }

   public String kodeBuku(){
    return kodeBuku;
   }

   public int getStock(){
    return stock;

   }

   public void setStock(int stock){
    this.stock = stock;
    
   }









}
