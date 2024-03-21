package P3.Mahasiswa;

public class Mahasiswa12 {
    public String nama;
    public int nim;
    public char jenisKelamin;
    public double ipk;

    public static double hitungTotalIPK(Mahasiswa12[] mhsArray) {
        double total = 0;
        for (Mahasiswa12 mahasiswa :mhsArray) {
            total += mahasiswa.ipk;
        }
        return total;
    }
    public static Mahasiswa12 ipkTerbesar(Mahasiswa12[] mhsArray) {
        Mahasiswa12 terbesar = mhsArray[0];
        for (int i = 1; i < mhsArray.length; i++) {
            if (mhsArray[i].ipk > terbesar.ipk) {
                terbesar = mhsArray[i];
            }
        }
        return terbesar;
    }
}