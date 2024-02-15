package P1;

import java.util.Scanner;

public class Perulangan12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);
        String nim;
        int n;
        System.out.print("Masukkan Nim : ");
        nim = sc12.nextLine();
        System.out.println("================");
        n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }
        System.out.println("n :" + n);
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print("* "); 
            } else if (i != 6 && i != 10) {
                System.out.print(i + " ");
            }
        }
    }
}
