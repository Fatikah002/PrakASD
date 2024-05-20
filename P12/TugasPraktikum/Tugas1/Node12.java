package P12.TugasPraktikum.Tugas1;

public class Node12 {
    String noAntrian;
    String nama;
    Node12 prev, next;

    Node12(Node12 prev, String noAntrian, String nama, Node12 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.next = next;
    }
}
