package P5.SumArray;

public class Sum12 {
    int elemen;
    double keuntungan[], total;
    
    Sum12(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if (l == r) {
            return arr[l];
        } else {
            int mid = ( l + r )/2;
            double lsum = totalDC(arr,l, mid);
            double rsum = totalDC(arr,  mid + 1, r);
            return lsum+rsum;
        }
       
    }
}
