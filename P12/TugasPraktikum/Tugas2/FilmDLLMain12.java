package P12.TugasPraktikum.Tugas2;

import java.util.Scanner;

public class FilmDLLMain12 {
    public static void main(String[] args) throws Exception {
        FilmDLL12 dataFilm = new FilmDLL12();
        Scanner sc12 = new Scanner(System.in);
        int pilihan;
        int index;
        boolean isTrue = false;
        String id, judulFilm;
        double rating;

        while (true) {
            System.out.println("===============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar ");
            System.out.println("===============================");
            pilihan = sc12.nextInt();
            sc12.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film:");
                    id = sc12.nextLine();
                    System.out.println("Judul Film:");
                    judulFilm = sc12.nextLine();
                    System.out.println("Rating Film:");
                    rating = sc12.nextDouble();
                    dataFilm.addFirst(id, judulFilm, rating);
                    break;

                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("ID Film:");
                    id = sc12.nextLine();
                    System.out.println("Judul Film:");
                    judulFilm = sc12.nextLine();
                    System.out.println("Rating Film:");
                    rating = sc12.nextDouble();
                    dataFilm.addLast(id, judulFilm, rating);
                    break;

                case 3:
                    System.out.println("Masukkan Data Film \nUrutan ke-");
                    System.out.println("ID Film:");
                    id = sc12.nextLine();
                    System.out.println("Judul Film:");
                    judulFilm = sc12.nextLine();
                    System.out.println("Rating Film:");
                    rating = sc12.nextDouble();
                    index = 2;
                    System.out.println("Data Film ini akan masuk di urutan ke- " + (index + 1));
                    dataFilm.add(id, judulFilm, rating, index);
                    break;

                case 4:
                    dataFilm.removeFirst();
                    break;

                case 5:
                    dataFilm.removeLast();
                    break;

                case 6:
                    System.out.println("Hapus data pada index tertentu");
                    index = sc12.nextInt();
                    dataFilm.remove(index);
                    break;

                case 7:
                    System.out.println("Cetak Data");
                    dataFilm.print();
                    break;

                case 8:
                    System.out.println("Cari Data");
                    System.out.println("Masukkan ID Film yang dicari: ");
                    id = sc12.nextLine();
                    index = dataFilm.findSeqSearchIdFilm(id);
                    if (index != -1) {
                        System.out.println("Data Id Film: " + id + " berada di node ke- " + (index + 1));
                        System.out.println("IDENTITAS:");
                        dataFilm.printSearch(id);
                    } else {
                        System.out.println("Data Id Film Tidak ditemukan ");
                    }
                    break;

                case 9:
                    dataFilm.bubbleSortDesc();
                    dataFilm.print();
                    break;

                case 10:
                    System.exit(0);
                    break;

            }

        }
    }
}
