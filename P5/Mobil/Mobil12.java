package P5.Mobil;
public class Mobil12 {
    String merk, tipe;
    int tahun, topAcceleration, topPower;

    public Mobil12(String merk, String tipe, int tahun, int topAcceleration, int topPower){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    int maxAccelerationDC(Mobil12[] mobil, int l, int r){
        if (l == r) {
            return mobil[l].topAcceleration;
        } 
            int mid = ( l + r )/2;
            int lmax = maxAccelerationDC(mobil,  l, mid );
            int rmax = maxAccelerationDC(mobil,  mid + 1, r);
            return Math.max(lmax, rmax);
    }

    int minAccelerationDC(Mobil12[] mobil, int l, int r){
        if (l == r) {
            return mobil[l].topAcceleration;
        } 
            int mid = ( l + r )/2;
            int lmin = minAccelerationDC(mobil,  l, mid );
            int rmin = minAccelerationDC(mobil,  mid + 1, r);
            return Math.min(lmin, rmin);
        }

    int maxAcceleration(Mobil12[] mobil){
        return maxAccelerationDC(mobil, 0, mobil.length -1);
    }

    int minAcceleration(Mobil12[] mobil){
    return minAccelerationDC(mobil, 0, mobil.length -1);
    }

    double rataTopPowerBF(Mobil12[] mobil){
        int totalPower = 0;
        int jmlMobil = mobil.length;
        for (int i = 0; i <jmlMobil; i++) {
          totalPower += mobil[i].topPower;  
        }
    return (double) totalPower / jmlMobil;
    }
}
