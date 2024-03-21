package Kuis1_12_1C_FatikahSalsabilla;

import java.util.Scanner;

public class Libmain12 {
    public static void main(String[] args) {
     Scanner fatikah12 = new Scanner (System.in);
    Book12[] books = new Book12[2];
    boolean exit = false;

    while (true) {
        System.out.println("======== JTI Library ========");
        System.out.println("Menu : \n1. Input data buku \n2. Display Data \n3.Kurangi Stock \n4. Peminjaman\n5. exit");
        System.out.print("Select menu : ");
        String pilihMenu = fatikah12.nextLine();
        
        switch(pilihMenu){
            case "1":
            for (int i = 0; i < books.length; i++) {
                System.out.println("===============");
            System.out.print("Kode buku : ");
            String kodeBuku = fatikah12.nextLine();
            System.out.print("Judul Buku : ");
            String judulBuku = fatikah12.nextLine();
            System.out.print("Pengarang : ");
            String pengarang = fatikah12.nextLine();
            System.out.print("Tahun terbit : ");
            int tahunTerbit =Integer.parseInt(fatikah12.nextLine());
            System.out.print("Stock : ");
            int stock =Integer.parseInt(fatikah12.nextLine());
            System.out.println("Data berhasil ditambahkan");
            books[i] = new Book12(kodeBuku, judulBuku, pengarang, tahunTerbit, stock);
            
            }

            System.out.print("Kembali ke menu (y)? ");
            if (!fatikah12.nextLine().equalsIgnoreCase("y")) {
                System.exit(0);
            }
            break;
            
            case "2":
            System.out.println("==============");
                    System.out.println("Data Buku:");
                    for (Book12 buku : books) {
                        if (buku != null) {
                            buku.displayInfo();
                        }

                    }
                    System.out.print("Kembali ke menu (y)? ");
                    if (!fatikah12.nextLine().equalsIgnoreCase("y")) {
                        exit = true;
                    }
                    break;
            
            case "3":
            System.out.println("Kurangi stock karena rusak");
            System.out.print("Kode buku : ");
            String updateCode = fatikah12.nextLine();
            Book12 stockUpdate = null;
            for (Book12 buku : books) {
                if (buku != null && buku.kodeBuku().equalsIgnoreCase(updateCode)) {
                    stockUpdate = buku;
                }
            }

            if (stockUpdate != null) {
                System.out.println("Jumlah Rusak: ");
                int stokRusak = fatikah12.nextInt();
                fatikah12.nextLine();

                if (stokRusak <= stockUpdate.getStock()) {
                    stockUpdate.setStock(stockUpdate.getStock() - stokRusak);

                }
                stockUpdate.displayInfo();
            }

            System.out.print("Kembali ke menu (y)? ");
            if (!fatikah12.nextLine().equalsIgnoreCase("y")) {
                exit = true;
            }
            break;

            
            case "4":
            System.out.print("Kembali ke menu (y)? ");
                    if (fatikah12.nextLine().equalsIgnoreCase("y")) {
                        break;
                    } else {
                        System.exit(0);
                    }
                    break;
             
            case "5":
            System.exit(0);
            break;
        }

    }
    }
   

}
