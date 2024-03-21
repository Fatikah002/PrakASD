package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc12.nextInt();

        Pangkat12[] png = new Pangkat12[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat12();
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc12.nextInt();
            png[i].nilai = nilai;
            System.out.println("Masukkan nilai pemangkat : ");
            int pangkat = sc12.nextInt();
            png[i].pangkat = pangkat;
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println(
                "Hasil dari "
                +png[i].nilai+ " pangkat "
                +png[i].pangkat+ " adalah "
                +png[i].pangkatBF(png[i].nilai, png[i].pangkat)
            );
        }

        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println(
                        "Hasil dari "
                        +png[i].nilai+ " pangkat "
                        +png[i].pangkat+ " adalah "
                        +png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                    );
                }
    }
}
