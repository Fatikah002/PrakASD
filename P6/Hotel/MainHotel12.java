package P6.Hotel;

public class MainHotel12 {
    public static void main(String[] args) {
        HotelService12 listHotel =new HotelService12();

        Hotel12 h = new Hotel12("Hotel 1", "Malang", 130000, (byte) 4);
        Hotel12 h1 = new Hotel12("Hotel 2", "Surabaya", 150000, (byte)5);
        Hotel12 h2 = new Hotel12("Hotel 3", "Batu", 100000, (byte)3);
        Hotel12 h3 = new Hotel12("Hotel 4", "Malang", 50000, (byte)1);
        Hotel12 h4= new Hotel12("Hotel 5", "Sidoarjo", 80000, (byte)2);

        listHotel.tambah(h);
        listHotel.tambah(h1);
        listHotel.tambah(h2);
        listHotel.tambah(h3);
        listHotel.tambah(h4);

        System.out.println("=======================");
        System.out.println("Data sebelum diurutkan");
        System.out.println("=======================");
        listHotel.tampilAll();

        System.out.println("\n==================================================================");
        System.out.println("Data setelah diurutkan dari Harga Termurah menggunakan Bubble Sort");
        System.out.println("==================================================================");
        listHotel.bubbleSort(true);
        listHotel.tampilAll();

        System.out.println("\n=====================================================================");
        System.out.println("Data setelah diurutkan dari Harga Termurah menggunakan Selection Sort");
        System.out.println("=====================================================================");
        listHotel.selectionSort(true);
        listHotel.tampilAll();

        System.out.println("\n=============================================================================");
        System.out.println("Data setelah diurutkan dari Rating Bintang Tertinggi menggunakan Bubble Sort ");
        System.out.println("=============================================================================");
        listHotel.bubbleSort(false);
        listHotel.tampilAll();

        System.out.println("\n================================================================================");
        System.out.println("Data setelah diurutkan dari Rating Bintang Tertinggi menggunakan Selection Sort ");
        System.out.println("================================================================================");
        listHotel.selectionSort(false);
        listHotel.tampilAll();

    }
}
