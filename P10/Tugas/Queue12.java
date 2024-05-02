package P10.Tugas;

public class Queue12 {
    Pembeli12[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue12(int n) {
        max = n;
        antrian = new Pembeli12[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli12 dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli12 Dequeue() {
        Pembeli12 dt = new Pembeli12();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama) {
        if (!isEmpty()) {
            for (int i = front; i != rear; i = (i + 1) % max) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + (i - front + 1));
                    return;
                }
            }

            if (antrian[rear].nama.equals(nama)) {
                System.out.println("Pembeli " + nama + " berada di posisi antrian ke-" + (rear - front + 1));
            } else {
                System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian");
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }
}
