package P12.TugasPraktikum.Tugas1;

import java.util.Scanner;

public class DLLMain12 {
    public static void main(String[] args) throws Exception {
        Queue12 queue = new Queue12();
        Scanner sc12 = new Scanner(System.in);
        int pilihan;
        boolean isTrue = false;

        String noAntrian, nama;

        while (true) {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar ");
            System.out.println("++++++++++++++++++++++++++++++");
            pilihan = sc12.nextInt();
            sc12.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian:");
                    noAntrian = sc12.nextLine();
                    System.out.println("Nama Penerima:");
                    nama = sc12.nextLine();
                    queue.enqueue(noAntrian, nama);
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        queue.dequeue();
                        queue.printQueue();
                    } else {
                        System.out.println("Antrian masih kosong, tidak dapat dihapus!");
                    }
                    break;

                case 3:
                    queue.printQueue();
                    break;

                case 4:
                    System.exit(0);
                    break;

            }

        }
    }
}
