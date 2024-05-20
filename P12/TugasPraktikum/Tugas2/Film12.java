package P12.TugasPraktikum.Tugas2;

public class Film12 {
    String id;
    String judulFilm;
    double rating;
    Film12 prev, next;

    Film12(Film12 prev, String id, String judulFilm, double rating, Film12 next) {
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }

}
