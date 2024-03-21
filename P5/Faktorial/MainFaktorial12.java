package P5.Faktorial;

import java.util.Scanner;

public class MainFaktorial12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("=================");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc12.nextInt();

        //membuat array of object 
        Faktorial12[] fk = new Faktorial12[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial12();
            System.out.println("Masukkan nilai data ke-" + (i +1) + " : ");
            int iNilai = sc12.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                "Hasil penghitungan faktorial menggunakan Brute force adalah "
                + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
          System.out.println(
                "Hasil penghitungan faktorial menggunakan Divide and Conquer adalah "
                + fk[i].faktorialDC(fk[i].nilai));  
        }
    }
}
