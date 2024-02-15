package P1;

public class Fungsi112 {
    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static String[] bunga = {"Algonema", "Keladi", "Alocasia", "Mawar"};
    static int[] harga = {75000, 50000, 60000, 10000}; 
    static int[][] penjualanCabang = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };

    static boolean semuaBungaTerjual(int[] penjualan) {
        for (int j : penjualan) {
            if (j != 0) {
                return false; 
            }
        }
        return true; 
    }

    static void hitungPendapatanSemuaTerjual() {
        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < harga.length; j++) {
                pendapatan += penjualanCabang[i][j] * harga[j];
            }
            System.out.println("Pendapatan di " + cabang[i] + ": Rp " + pendapatan);
        }
    }

    public static void main(String[] args) {
        System.out.println("Pendapatan jika semua bunga habis terjual:");
        hitungPendapatanSemuaTerjual();
    }      
}