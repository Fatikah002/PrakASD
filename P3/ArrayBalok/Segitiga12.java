package P3.ArrayBalok;

public class Segitiga12 {
    public int alas;
    public int tinggi;

    public Segitiga12(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
    public double hitungKeliling(){
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
    public static void main(String[] args) {
        Segitiga12[] sgArray12 =  new Segitiga12[4];
        sgArray12[0] = new Segitiga12(10, 4);
        sgArray12[1] = new Segitiga12(20, 10);
        sgArray12[2] = new Segitiga12(15, 6);
        sgArray12[3] = new Segitiga12(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("sgArray ke-" + i + "    alas: " + sgArray12[i].alas + ", tinggi: " + sgArray12[i].tinggi);
            System.out.println("Luas Segitiga     : " + sgArray12[i].hitungLuas());
            System.out.println("Keliling Segitiga : " + sgArray12[i].hitungKeliling());
    }
  }
}
