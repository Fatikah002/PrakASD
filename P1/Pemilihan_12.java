package P1;

import java.util.Scanner;

/**
 * Pemilihan_12
 */
public class Pemilihan_12 {
public static void main(String[] args) {
    Scanner sc12 = new Scanner(System.in);
    double nilaiTugas, nilaiKuis, nilaiUts, nilaiUas, nilaiAkhir;
    String nilaiHuruf, hasil;
    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("==============================");
    System.out.print("Masukkan Nilai Tugas : ");
    nilaiTugas = sc12.nextDouble();
    System.out.print("Masukkan Nilai Kuis  : ");
    nilaiKuis = sc12.nextDouble();
    System.out.print("Masukkan Nilai UTS   : ");
    nilaiUts = sc12.nextDouble();
    System.out.print("Masukkan Nilai UAS   : ");
    nilaiUas = sc12.nextDouble();
    System.out.println("==============================");
    System.out.println("==============================");

    if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 ||
    nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) {
    System.out.println("Nilai tidak valid");
    System.out.println("==============================");
    System.out.println("==============================");
    return;
}
    nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.3);
    if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
        nilaiHuruf = "A";
        hasil = "SELAMAT ANDA LULUS";
       }
       else if (nilaiAkhir >= 73){
        nilaiHuruf = "B+";
        hasil = "SELAMAT ANDA LULUS";
       }
        else if (nilaiAkhir >= 65){
        nilaiHuruf = "B";
        hasil = "SELAMAT ANDA LULUS";
       }
        else if (nilaiAkhir >= 60){
        nilaiHuruf = "C+";
        hasil = "SELAMAT ANDA LULUS";
       }
        else if (nilaiAkhir >= 50){
        nilaiHuruf = "C";
        hasil = "SELAMAT ANDA LULUS";
       }
        else if (nilaiAkhir >= 39){
        nilaiHuruf = "D";
        hasil = "TIDAKLULUS";
       } 
       else if(nilaiAkhir >= 0) {
        nilaiHuruf = "E";
        hasil = "TIDAKLULUS";
       }
       else {
        nilaiHuruf = "Nilai tidak valid";
        hasil ="";   
        System.out.println();  
        
       }
    
       System.out.println("Nilai Akhir : " + nilaiAkhir);
       System.out.println("Nilai Huruf : " + nilaiHuruf);
       System.out.println("==============================");
       System.out.println("==============================");
       System.out.println(hasil);
       
}   
}