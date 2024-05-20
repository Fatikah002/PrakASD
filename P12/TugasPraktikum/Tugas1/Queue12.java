package P12.TugasPraktikum.Tugas1;

public class Queue12 {
    Node12 head;
    int size;

    public Queue12() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(String noAntrian, String nama) {
        if (isEmpty()) {
            head = new Node12(null, noAntrian, nama, null);
        } else {
            Node12 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node12 newNode = new Node12(current, noAntrian, nama, null);
            current.next = newNode;
        }
        size++;
    }

    public void dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            System.out.println(head.nama + " telah di vaksinasi.");
            head = null;
        } else {
            System.out.println(head.nama + " telah di vaksinasi.");
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian kosong");
        }
        return "Nomor Antrian: " + head.noAntrian + ", Nama: " + head.nama;
    }

    public void printQueue() {
        if (!isEmpty()) {
            Node12 tmp = head;
            System.out.println("+++++++++++++++++++++");
            System.out.println("Data Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++");
            System.out.printf("| %-5s | %-5s |\n", "No.", "Nama");
            while (tmp != null) {
                System.out.printf("| %-5s | %-5s |\n", tmp.noAntrian, tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian : " + size);
        } else {
            System.out.println("Antrian Kosong");
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

}
