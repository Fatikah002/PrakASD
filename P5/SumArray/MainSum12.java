package P5.SumArray;
import java.util.Scanner;
public class MainSum12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("==================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc12.nextInt();

        
        Sum12 sm = new Sum12(elm);
        System.out.println("==================================================================");
        for (int i = 0; i <sm.elemen; i++) {
            System.out.print("Masukkan untung bukan ke - " + (i+1) + " = ");
             sm.keuntungan[i] =  sc12.nextDouble();
        }

        System.out.println("==================================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
        System.out.println("==================================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalDC(0, sm.elemen - 1));
    }   
}
