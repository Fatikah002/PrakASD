package P10.Tugas;

import java.util.Scanner;

public class QueueMain12 {

    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Daftar pembeli ");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("6. Cek antrian pembeli");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah= sc12.nextInt();

        Queue12 antri = new Queue12(jumlah);
        int pilih;
        do {
            menu();
            pilih = sc12.nextInt();
            sc12.nextLine();
            switch (pilih) {
                case 1:
                System.out.print("Nama : ");
                String nama = sc12.nextLine();
                System.out.print ("No HP : ");
                int noHP = sc12.nextInt();
                Pembeli12 p = new Pembeli12 (nama, noHP);
                sc12.nextLine();
                antri.Enqueue(p) ;
                break;

                case 2:
                Pembeli12 data = antri.Dequeue();
                if (!"".equals (data.nama) &&  data.noHP != 0) {
                System. out.println ("Antrian yang keluar: " + data.nama + " " + data.noHP);
                break;
                }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.daftarPembeli();
                    break;

                case 5:
                    antri.peekRear();
                    break;
                
                case 6:
                    System.out.print("Masukkan nama pembeli yang ingin dicek posisinya: ");
                    nama = sc12.nextLine();
                    antri.peekPosition(nama);
                    break;
                
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 );
    }
}
