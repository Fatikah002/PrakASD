package P11.Tugas_P11.Tugas1;

public class Sll12 {

    Node12 head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            Node12 tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print("NIM : " + tmp.data.nim + " Nama : " + tmp.data.nama + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    void addFirst(Mahasiswa12 data) {
        Node12 ndInput = new Node12(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;

        }
    }

    void addLast(Mahasiswa12 data) {
        Node12 ndInput = new Node12(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, Mahasiswa12 data) {
        Node12 ndInput = new Node12(data, head);
        Node12 temp = head;
        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            addLast(data);
        }

    }

    void insertAt(int index, Mahasiswa12 data) {
        Node12 ndInput = new Node12(data, null);
        if (index < 0) {
            System.out.println(" indeks tidak valid");
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node12 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp = temp.next;
            temp.next = new Node12(data, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }

        }
    }

    Mahasiswa12 getData(int index) {
        Node12 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOF(int key) {
        Node12 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nim.equals(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else {
            return -1;
        }
    }

}
