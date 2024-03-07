package P3.BangunDatar;

import P3.AOBpersegipanjang.PersegiPanjang12;
import P3.ArrayBalok.Segitiga12;

public class BangunDatar12 {
    Segitiga12[] segitigas;
    PersegiPanjang12[] persegiPanjangs;

    void tambahSgt(Segitiga12[] segitiga){
        this.segitigas = segitiga;
    }

    void tambahPp(PersegiPanjang12[] persegiPanjang){
        this.persegiPanjangs = persegiPanjang;
    }

    void tampilBangunDatar(){
        for (int i = 0; i < persegiPanjangs.length; i++) {
            System.out.println("persegi panjang " + (i +1));
            System.out.println("lebar: " +persegiPanjangs[i].lebar);
            System.out.println("panjang: " + persegiPanjangs[i].panjang);
        }
        System.out.println("====================================");
        for (int j = 0; j < segitigas.length; j++) {
            System.out.println("segitiga " + (j+1));
            System.out.println("alas: " + segitigas[j].alas);
            System.out.println("tinggi: "+ segitigas[j].tinggi);
        }
    }
}