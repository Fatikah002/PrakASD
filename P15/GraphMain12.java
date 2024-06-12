package P15;

import java.util.Scanner;

public class GraphMain12 {
    public static void main(String[] args) throws Exception {
        Scanner sc12 = new Scanner(System.in);
        boolean Istrue = false;
        // GraphMatriks12 gdg = new GraphMatriks12(4);
        // while (true) {

        //     System.out.println("Menu:");
        //     System.out.println("a. Add Edge");
        //     System.out.println("b. Remove Edge");
        //     System.out.println("c. Degree");
        //     System.out.println("d. Print Graph");
        //     System.out.println("e. Cek Edge");
        //     System.out.print("Pilih menu: ");
        //     String pilihan = sc12.nextLine();

        //     switch (pilihan) {
        //         case "a":
        //             System.out.print("Masukkan gedung asal  : ");
        //             int asal = sc12.nextInt();
        //             System.out.print("Masukkan gedung tujuan: ");
        //             int tujuan = sc12.nextInt();
        //             System.out.print("Masukkan jarak        : ");
        //             int jarak = sc12.nextInt();
        //             gdg.makeEdge(asal, tujuan, jarak);
        //             sc12.nextLine();
        //             break;

        //         case "b":
        //             System.out.print("Masukkan gedung asal  : ");
        //             asal = sc12.nextInt();
        //             System.out.print("Masukkan gedung tujuan: ");
        //             tujuan = sc12.nextInt();
        //             gdg.removeEdge(asal, tujuan);
        //             sc12.nextLine();
        //             break;

        //         case "c":
        //             System.out.print("Masukkan gedung       : ");
        //             asal = sc12.nextInt();
        //             gdg.degree(asal);
        //             sc12.nextLine();
        //             break;

        //         case "d":
        //             gdg.printGraph();
        //             break;

        //         case "e":
        //             System.out.print("Masukkan gedung asal  : ");
        //             asal = sc12.nextInt();
        //             System.out.print("Masukkan gedung tujuan: ");
        //             tujuan = sc12.nextInt();
        //             if (gdg.cekEdge(asal, tujuan)) {
        //                 System.out.println("Edge antara Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " ada.");
        //             } else {
        //                 System.out.println("Edge antara Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak ada.");
        //             }
        //             sc12.nextLine();
        //             break;

        //             case "f":
        //             System.out.print("Masukkan gedung asal  : ");
        //             asal = sc12.nextInt();
        //             System.out.print("Masukkan gedung tujuan: ");
        //             tujuan = sc12.nextInt();
        //             System.out.print("Masukkan jarak baru   : ");
        //             jarak = sc12.nextInt();
        //             gdg.updateJarak(asal, tujuan, jarak);
        //             sc12.nextLine();
        //             break;

        //     }

        // } 
        Graph12 gedung = new Graph12(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();

        gedung.updateJarak(0, 2, 200);
        System.out.println("Jarak setelah di update");
        gedung.printGraph();


  }
}
       
        // for (int i = 0; i < 2; i++) {
        // System.out.print("Masukkan gedung asal: ");
        // int asal = sc12.nextInt();
        // System.out.print("Masukkan gedung tujuan: ");
        // int tujuan = sc12.nextInt();

        // if (gedung.ttg(asal, tujuan)) {
        // System.out
        // .println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) +
        // " bertetangga \n");
        // } else {
        // System.out.println(
        // "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak
        // bertetangga \n");
        // }
        // }

        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();

        // for (int i = 0; i < gdg.vertex; i++) {
        // gdg.degree(i);
        // }
  
