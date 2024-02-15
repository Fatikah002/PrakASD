package P1;
import java.util.Scanner;
public class Tugas1 {
    static char[] kode = new char[10];
    static char[][] kota = new char[10][12];
    static char kodePlat;
    static int indexKota;
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    kode[0] = 'A';
    kode[1] = 'B';
    kode[2] = 'D';
    kode[3] = 'E';
    kode[4] = 'F';
    kode[5] = 'G';
    kode[6] = 'H';
    kode[7] = 'L';
    kode[8] = 'N';
    kode[9] = 'T';
           
    kota[0] = new char[] {'B', 'A', 'N', 'T', 'E', 'N'};
    kota[1] = new char[] {'J', 'A', 'K', 'A', 'R', 'T', 'A'};
    kota[2] = new char[] {'B', 'A', 'N', 'D', 'U', 'N', 'G'};
    kota[3] = new char[] {'C', 'I', 'R', 'E', 'B', 'O', 'N'};
    kota[4] = new char[] {'B', 'O', 'G', 'O', 'R'};
    kota[5] = new char[] {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'};
    kota[6] = new char[] {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'};
    kota[7] = new char[] {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'};
    kota[8] = new char[] {'M', 'A', 'L', 'A', 'N', 'G'};
    kota[9] = new char[] {'T', 'E', 'G', 'A', 'L'};

        System.out.print("Masukkan Kode Plat Nomor : ");
        kodePlat = scanner.nextLine().charAt(0);
        int indexKota = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kodePlat == kode[i]) {
                indexKota = i;
                break;
            }
        }
                
        if (indexKota != -1 && indexKota < kota.length) {
        System.out.print("Kota                     : ");
            for (char hurufKota : kota[indexKota]) {
                System.out.print(hurufKota ); 
            }
        } else {
            System.out.println("Kode plat nomor tidak ditemukan!");
        }
    }
}