package P5.SumArray;
import java.util.Scanner;
public class MainSum12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        // System.out.println("==================================================================");
        // System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jmlPerusahaan = sc12.nextInt();
        
        Sum12[] perusahaan = new Sum12[jmlPerusahaan];
        System.out.println("==================================================================");
        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan perusahaan " + (i+1) +" : ");
           int elemen = sc12.nextInt();
           perusahaan[i] = new Sum12(elemen);

           for (int j = 0; j < elemen; j++) {
            System.out.print("Masukkan keuntungan untuk bulan ke-" + (j+1) + " perusahaan " + (i +1) + " : ");
            double keuntungan = sc12.nextDouble();
            perusahaan[i].setKeuntungan(j+1, keuntungan);
            }
        }

        System.out.println("\nTotal Keuntungan Perusahaan");
        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("Perusahaan " + (i+1) + " : ");
            System.out.println("Algoritma Brute Force        : " + perusahaan[i].keuntunganBF());
            System.out.println("Algoritma Divide and Conquer : " + perusahaan[i].keuntunganDC());
        }
        // for (int i = 0; i <sm.elemen; i++) {
        //     System.out.print("Masukkan untung bukan ke - " + (i+1) + " = ");
        //      sm.keuntungan[i] =  sc12.nextDouble();
        // }
        // System.out.println("==================================================================");
        // System.out.println("Algoritma Brute Force");
        // System.out.println("Total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
        // System.out.println("==================================================================");
        // System.out.println("Algoritma Divide Conquer");
        // System.out.println("Total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    }   
}
