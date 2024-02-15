package P1;

public class Fungsi212 {
    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    static String[] bunga = {"Algonema", "Keladi", "Alocasia", "Mawar"};
    static int[][] penjualanCabang = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };
    static int[] penguranganStok = {-1, -2, 0, -5}; 

    static void jumlahStockSetiapCabang() {
        for (int i = 0; i < cabang.length; i++) {
            System.out.println("Jumlah Stock di " + cabang[i] + ":");
            for (int j = 0; j < bunga.length; j++) {
                int jumlahStock = penjualanCabang[i][j] + (i == 3 ? penguranganStok[j] : 0);
                System.out.println(bunga[j] + ": " + jumlahStock);
            }
            if (i == 3) {
                System.out.println("\nPengurangan stok karena bunga mati di " + cabang[i] + ":");
                for (int j = 0; j < bunga.length; j++) {
                    System.out.println(bunga[j] + ": " + penguranganStok[j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        jumlahStockSetiapCabang();
    }
}
