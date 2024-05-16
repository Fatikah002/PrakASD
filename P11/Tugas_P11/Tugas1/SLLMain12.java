package P11.Tugas_P11.Tugas1;

public class SLLMain12 {
    public static void main(String[] args) {
        Sll12 sll = new Sll12();

        sll.print();
        sll.addFirst(new Mahasiswa12("111", "Anton"));
        sll.print();
        sll.addLast(new Mahasiswa12("112", "Prita"));
        sll.print();
        sll.insertAfter(111, new Mahasiswa12("113", "Yusuf"));
        sll.print();
        sll.insertAt(2, new Mahasiswa12("114", "Doni"));
        sll.print();
        sll.addLast(new Mahasiswa12("115", "Sari"));
        sll.print();
    }
}
