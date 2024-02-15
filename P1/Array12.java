package P1;
import java.util.Scanner;
public class Array12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        String[] mk = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        double[] nilai = new double[mk.length]; 

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilai[i] = sc12.nextDouble(); 
        }
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-40s %-15s %-15s %-15s%n",
                          "Mata Kuliah",
                          "Nilai Angka",
                          "Nilai Huruf",
                          "Bobot Nilai");
        

        double totalBobotNilai = 0;
        double totalSks = 0;

        for (int i = 0; i < mk.length; i++) {
            String nilaiHuruf;
            double bobotNilai;

            if (nilai[i] >= 80 && nilai[i] <= 100) {
                nilaiHuruf = "A";
                bobotNilai = 4.00;
            } else if (nilai[i] >= 73) {
                nilaiHuruf = "B+"; 
                bobotNilai = 3.5;
            } else if (nilai[i] >= 65) {
                nilaiHuruf = "B";
                bobotNilai = 3.0;
            } else if (nilai[i] >= 60) {
                nilaiHuruf = "C+";
                bobotNilai = 2.5;
            } else if (nilai[i] >= 50) {
                nilaiHuruf = "C";
                bobotNilai = 2.0;
            } else if (nilai[i] >= 39) {
                nilaiHuruf = "D";
                bobotNilai = 1.0;
            } else {
                nilaiHuruf = "E";
                bobotNilai = 0.0;
            }
            totalSks += sks[i];
            totalBobotNilai += bobotNilai * sks[i];
            System.out.printf("%-40s %-15.2f %-15s %-15.2f%n",
                              mk[i],
                              nilai[i],
                              nilaiHuruf,
                              bobotNilai);
        }

        double nilaiAkhir = totalBobotNilai / totalSks;
        nilaiAkhir = Math.round(nilaiAkhir * 100.0) / 100.0;
        System.out.println("====================");
        System.out.println("IP : " + nilaiAkhir);
    }
}