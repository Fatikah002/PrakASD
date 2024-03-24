package P5.Mobil;
import java.util.Scanner;
public class MainMobil12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data mobil : ");
        int jmlMobil = sc12.nextInt();
        sc12.nextLine();
        
        Mobil12[] mobil = new Mobil12[jmlMobil];
        for (int i = 0; i < jmlMobil; i++) {

            System.out.println("Data Mobil ke-" + (i +1));
            System.out.print("Merk             : ");
            String merk = sc12.nextLine();
            System.out.print("Tipe             : ");
            String tipe = sc12.nextLine();
            System.out.print("Tahun            : ");
            int tahun = sc12.nextInt();
            sc12.nextLine();
            System.out.print("Top acceleration : ");
            int topAcceleration = sc12.nextInt();
            sc12.nextLine();
            System.out.print("Top power        : ");
            int topPower = sc12.nextInt();
            sc12.nextLine();

            mobil[i] = new Mobil12(merk, tipe, tahun, topAcceleration, topPower);
        }
        System.out.println("Top acceleration tertinggi  : " + mobil[0].maxAcceleration(mobil));
        System.out.println("Top acceleration terendah   : " + mobil[0].minAcceleration(mobil));
        System.out.println("Rata-rata top power         : " + mobil[0].rataTopPowerBF(mobil));
    }
}
