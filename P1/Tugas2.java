package P1;
import java.util.Scanner;
public class Tugas2 {
    static Scanner sc12 = new Scanner(System.in);

     public static void main(String[] args) {
        
   
           while (true) {
               System.out.println("Menu:");
               System.out.println("1. Hitung Kecepatan");
               System.out.println("2. Hitung Jarak");
               System.out.println("3. Hitung Waktu");
               System.out.println("4. Keluar");
               System.out.print("Masukkan pilihan: ");
               int pilihMenu = sc12.nextInt();
   
               switch (pilihMenu) {
                   case 1:
                       hitungKecepatan();
                       break;
                   case 2:
                       hitungJarak();
                       break;
                   case 3:
                       hitungWaktu();
                       break;
                   case 4:
                       System.exit(0);
                   default:
                       System.out.println("Pilihan tidak valid!");
               }
           }
       }
   
       static void hitungKecepatan() {
           System.out.print("Masukkan jarak (km)            : ");
           double jarak = sc12.nextDouble();
           System.out.print("Masukkan waktu (jam)           : ");
           double waktu = sc12.nextDouble();
           double kecepatan = jarak / waktu;
           System.out.println("Kecepatan adalah               : " + kecepatan + " km/jam");
       }
   
       static void hitungJarak() {
           System.out.print("Masukkan kecepatan (km/jam)    : ");
           double kecepatan = sc12.nextDouble();
           System.out.print("Masukkan waktu (jam)           : ");
           double waktu = sc12.nextDouble();
           double jarak = kecepatan * waktu;
           System.out.println("Jarak adalah                   : " + jarak + " km");
       }
   
       static void hitungWaktu() {
           System.out.print("Masukkan jarak (km)            : ");
           double jarak = sc12.nextDouble();
           System.out.print("Masukkan kecepatan (km/jam)    : ");
           double kecepatan = sc12.nextDouble();
           double waktu = jarak / kecepatan;
           System.out.println("Waktu adalah                   : " + waktu + " jam");
       }
   }