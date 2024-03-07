package P3.AOBpersegipanjang;
import java.util.Scanner;
public class ArrayObjects12 {
    public static void main(String[] args) {
        PersegiPanjang12[][] ppArray = new PersegiPanjang12[3][3];
        Scanner sc12 =  new Scanner(System.in);
        // for (int i = 0; i < 3; i++) {
        //     ppArray[i] = new PersegiPanjang12();
        //     System.out.println("Persegi panjang ke-" + i);
        //     System.out.print("Masukkan panjang: ");
        //     ppArray[i].panjang = sc12.nextInt();
        //     System.out.print("Masukkan lebar: ");
        //     ppArray[i].lebar = sc12.nextInt();

        // }
       
        // for (int i = 0; i < ppArray.length; i++) {
        //     System.out.println("Persegi Panjang ke-" + i);
        //     System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " +ppArray[i].lebar) ;
        // }

        for (int i = 0; i < ppArray.length; i++) {
            for (int j = 0; j < ppArray[i].length; j++) {
                ppArray[i][j] = new PersegiPanjang12();
                System.out.print("Masukkan panjang: ");
                ppArray[i][j].panjang = sc12.nextInt();
                System.out.print("Masukkan lebar: ");
                 ppArray[i][j].lebar = sc12.nextInt();
            }
        }

        for (int i = 0; i < ppArray.length; i++) {
            for (int j = 0; j < ppArray[i].length; j++) {
                System.out.println("Panjang: " + ppArray[i][j].panjang + ", lebar: " + ppArray[i][j].lebar);
            }
        }

        //Persegi
        Persegi12[] pgArray = new Persegi12[100];
        pgArray[5].sisi = 20;
    }
}
