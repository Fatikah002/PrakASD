package P3.BangunDatar;

import P3.AOBpersegipanjang.PersegiPanjang12;
import P3.ArrayBalok.Segitiga12;

public class BangunMain12 {
    public static void main(String[] args) {
        Segitiga12 sg1 = new Segitiga12(5, 10);
    Segitiga12 sg2 = new Segitiga12(10, 15);
    Segitiga12 sg3 = new Segitiga12(15, 20);
    PersegiPanjang12 pp1 = new PersegiPanjang12(5, 10);
    PersegiPanjang12 pp2 = new PersegiPanjang12(2, 8);
    PersegiPanjang12 pp3 = new PersegiPanjang12(10, 15);

    Segitiga12[] s = new Segitiga12[3];
    PersegiPanjang12[] p = new PersegiPanjang12[3];

    s[0]= sg1;
    s[1]= sg2;
    s[2]= sg3;
    p[0] = pp1;
    p[1] = pp2;
    p[2] = pp3;

    BangunDatar12 bd = new BangunDatar12();
    bd.tambahSgt(s);
    bd.tambahPp(p);
    bd.tampilBangunDatar();

    }
}
