package Kuis1_12_1C_FatikahSalsabilla;


public class Transaksi12 {
    private String idTransaksi;
    private Book12[] arrBook;
    private int currentIndex;

    public Transaksi12(String idTransaksi) {
        this.idTransaksi = idTransaksi;
        arrBook = new Book12[4]; 
        currentIndex = 0;
    }

    public void addData(Book12 book) {
        if (currentIndex < arrBook.length) {
            arrBook[currentIndex] = book;
            currentIndex++;
            System.out.println("Buku berhasil ditambahkan ke dalam transaksi.");
        } else {
            System.out.println("Transaksi penuh, tidak dapat menambahkan buku lagi.");
        }
    }
}
