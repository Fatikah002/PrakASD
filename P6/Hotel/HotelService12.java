package P6.Hotel;

public class HotelService12 {
    Hotel12[] rooms = new Hotel12[5];
    int count;

    void tambah(Hotel12 h){
        if (count < rooms.length ) {
            rooms[count] = h;
            count++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll(){
        for (Hotel12 h : rooms) {
            h.tampil();
        }
    }
    
    void bubbleSort(boolean byHarga){
        if (byHarga) {
             //harga termurah
        for (int i = 0; i < rooms.length -1; i++) {
            for (int j = 0; j < rooms.length-i-1; j++) {
                    if (rooms[j].harga > rooms[j+1].harga) {
                    Hotel12 tempHarga = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = tempHarga;
                }  
            }
        }
        } else {
             //bintang tertinggi
            for (int i = 0; i < rooms.length -1; i++) {
            for (int j = 0; j < rooms.length-i-1; j++) {
                    if (rooms[j].bintang < rooms[j+1].bintang) {
                    Hotel12 tempBintang = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = tempBintang;
                }  
            }
        }
        }
       

       
    }

    void selectionSort(boolean byHarga){
        if (byHarga) {
             //harga termurah
            for (int i = 0; i < rooms.length - 1; i++) {
                int countMin = i;
                for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[countMin].harga) {
                    countMin = j;
                }
                }
                Hotel12 tempHarga = rooms[countMin];
                rooms[countMin] = rooms[i];
                rooms[i] = tempHarga;
            }
        } 
        else {
            //bintang tertinggi
            for (int i = 0; i < rooms.length - 1; i++) {
            int countMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[countMax].bintang) {
                    countMax = j;
                }
            }
            Hotel12 tempBintang = rooms[countMax];
            rooms[countMax] = rooms[i];
            rooms[i] = tempBintang;
            }
        }
       

        

    }
}
