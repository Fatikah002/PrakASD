package P6;

public class DaftarBuku12 {
   
        Buku12 listBk[] = new Buku12[5];
        int idx;

        void tambah (Buku12 m){
            if (idx < listBk.length) {
                listBk[idx] = m;
                idx++;
            } else{
                System.out.println("Data sudah penuh");
            }
        }

        void tampil(){
            for (Buku12 m : listBk) {
                    m.tampilDataBuku();
            }
        }

        void bubbleSort(){
            for (int i = 0; i < listBk.length -1; i++) {
                for (int j = 0; j < listBk.length-i-1; j++) {
                        if (listBk[j].stock > listBk[j+1].stock) {
                        Buku12 tempBk = listBk[j];
                        listBk[j] = listBk[j+1];
                        listBk[j+1] = tempBk;
                    }  
                }
            }
        }

        


}

