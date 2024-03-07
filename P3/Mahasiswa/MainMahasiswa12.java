package P3.Mahasiswa;
import java.util.Scanner;
public class MainMahasiswa12 {
public static void main(String[] args) {
    Mahasiswa12[] mhsArray = new Mahasiswa12[3];
    Scanner sc12 = new Scanner(System.in);
    for (int i = 0; i < mhsArray.length; i++) {
        mhsArray[i] = new Mahasiswa12();
        System.out.println("Masukkan data mahasiswa ke- " + (i+1));
        System.out.print("Masukkan Nama          : ");
        mhsArray[i].nama = sc12.nextLine();
        System.out.print("Masukkan NIM           : ");
        mhsArray[i].nim = sc12.nextInt();
        System.out.print("Masukkan jenis kelamin : ");
        mhsArray[i].jenisKelamin = sc12.next().charAt(0);   
        System.out.print("Masukkan IPK           : ");
        mhsArray[i].ipk = sc12.nextDouble();
        sc12.nextLine();
        
    }
    System.out.println();
    for (int i = 0; i < mhsArray.length; i++) {
       
       System.out.println("Data mahasiswa ke- " + (i+1));
       System.out.println("Nama           : " + mhsArray[i].nama);
       System.out.println("NIM            : " + mhsArray[i].nim);
       System.out.println("Jenis kelamin  : " + mhsArray[i].jenisKelamin);
       System.out.println("Nilai IPK      : " + mhsArray[i].ipk);
    }
}
    
}