package P11.Tugas_P11.Tugas2;

public class Main12 {
    public static void main(String[] args) {
        Queue12 queue = new Queue12();

        queue.print();
        queue.enqueue(new Mahasiswa12("111", "Anton"));
        queue.print();
        queue.enqueue(new Mahasiswa12("112", "Prita"));
        queue.print();
        queue.enqueue(new Mahasiswa12("113", "Yusuf"));
        queue.print();
        queue.enqueue(new Mahasiswa12("114", "Doni"));
        queue.print();
        queue.enqueue(new Mahasiswa12("115", "Sari"));
        queue.print();

        queue.dequeue();
        System.out.println("Antrian setelah dequeue:");
        queue.print();

    }
}
