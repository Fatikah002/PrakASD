package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in); 
        
        System.out.println("====================================");
        System.out.println("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc12.nextInt();
        boolean exit = false;
        
        Pangkat12[] png = new Pangkat12[elemen];
        for (int i = 0; i < elemen; i++) {
            // png[i] = new Pangkat12();
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc12.nextInt();
            // png[i].nilai = nilai;
            System.out.println("Masukkan nilai pemangkat : ");
            int pangkat = sc12.nextInt();
            // png[i].pangkat = pangkat;
            png[i] = new Pangkat12(nilai, pangkat);
        }

        while (true) {
        System.out.println("=======================================");
        System.out.println("Menu Metode : \n1. Brute Force \n2. Divide and Conquer \n3. Exit");
        System.out.print("Pilih Menu : ");
        int pilihan = sc12.nextInt();
        System.out.println("=======================================");
            switch (pilihan) {
            
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println(
                            "Hasil dari "
                            +png[i].nilai+ " pangkat "
                            +png[i].pangkat+ " adalah "
                            +png[i].pangkatBF(png[i].nilai, png[i].pangkat)
                            );
                }    
                
                System.out.print("Apakah ingin kembali ke menu (y)? ");
                sc12.nextLine();
                String kembali = sc12.nextLine();
                if (!kembali.equalsIgnoreCase("y")) {
                    System.exit(0);
                }
            break;

            case 2:
                System.out.println("\nHASIL PANGKAT - DIVIDE AND CONQUER");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println(
                            "Hasil dari "
                            +png[i].nilai+ " pangkat "
                            +png[i].pangkat+ " adalah "
                            +png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                        );
                    }
                    
                System.out.println("Apakah ingin kembali ke menu (y)? ");
                sc12.nextLine();
                kembali = sc12.nextLine();
                    if (!kembali.equalsIgnoreCase("y")) {
                        System.exit(0);
                    }
            break;

            case 3:
                System.exit(0);
            }
        }
    }
}
