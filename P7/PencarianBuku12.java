package P7;

public class PencarianBuku12 {
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

    public int findSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari) ) {
                posisi  = j ;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(String x, int pos){
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }

    }

    public void tampilData(String x, int pos){
        if (pos != -1) {
            System.out.println("Kode Buku   \t : " + listBk[pos].kodeBuku);
            System.out.println("Judul       \t : " + x);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang   \t : " + listBk[pos].pengarang);
            System.out.println("Stock       \t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public Buku12 findBuku(String cari) {
        for (Buku12 buku : listBk) {
            if (buku != null && (buku.kodeBuku).equals(cari)) {
                return buku;
            }
        }
        return null;
    }

    public int findBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            int compare = listBk[mid].kodeBuku.compareTo(cari);
            
            if (compare == 0) {
                return mid;
            } else if (compare <  0) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    public int findSeqSearchJudul(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
            }
        }
        return posisi;
    }

    public int findBinarySearchJudul(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            int compare = listBk[mid].judulBuku.compareToIgnoreCase(cari);

            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                return findBinarySearchJudul(cari, mid + 1, right);
            } else {
                return findBinarySearchJudul(cari, left, mid - 1);
            }
        }
        return -1;
    }

    public void bubbleSortJudul() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku12 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }
}