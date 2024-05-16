package P11.Tugas_P11.Tugas2;

public class Queue12 {
    Node12 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } else {
            Node12 tmp = head;
            System.out.print("Antrian Layanan Unit Kemahasiswaan: ");
            while (tmp != null) {
                System.out.print("NIM: " + tmp.data.nim + " Nama: " + tmp.data.nama);
                if (tmp.next != null) {
                    System.out.print(" ");
                }
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    void enqueue(Mahasiswa12 data) {
        Node12 newNode = new Node12(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    Mahasiswa12 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa12 hapusData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return hapusData;
    }

    Mahasiswa12 peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }
        return head.data;
    }

}
