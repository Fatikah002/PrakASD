package P15;

import java.util.Scanner;

public class GraphMain12 {
    public static void main(String[] args) throws Exception {
        Scanner sc12 = new Scanner(System.in);
        // Graph12 gedung = new Graph12(6);
        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // // gedung.degree(0);
        // // gedung.printGraph();

        // // gedung.removeEdge(1, 3);
        // // gedung.printGraph();

        // for (int i = 0; i < 2; i++) {
        //     System.out.print("Masukkan gedung asal: ");
        //     int asal = sc12.nextInt();
        //     System.out.print("Masukkan gedung tujuan: ");
        //     int tujuan = sc12.nextInt();

        //     if (gedung.ttg(asal, tujuan)) {
        //         System.out
        //                 .println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga \n");
        //     } else {
        //         System.out.println(
        //                 "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga \n");
        //     }
        // }

        GraphMatriks12 gdg = new GraphMatriks12(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        for (int i = 0; i < gdg.vertex; i++) {
            gdg.degree(i);
        }
    }
}
