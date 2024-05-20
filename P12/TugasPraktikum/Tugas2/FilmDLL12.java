package P12.TugasPraktikum.Tugas2;

public class FilmDLL12 {
    Film12 head;
    int size;

    public FilmDLL12() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String id, String judulFilm, double rating) {
        if (isEmpty()) {
            head = new Film12(null, id, judulFilm, rating, null);
        } else {
            Film12 newNode = new Film12(null, id, judulFilm, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String id, String judulFilm, double rating) {
        if (isEmpty()) {
            addFirst(id, judulFilm, rating);
        } else {
            Film12 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Film12 newNode = new Film12(current, id, judulFilm, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String id, String judul, double rating, int index) {
        if (index < 0 || index > size) {
            System.out.println("Indeks di luar batas.");
            return;
        }

        if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            Film12 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            Film12 newNode = new Film12(current, id, judul, rating, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }

    }

    public int getIndex(Film12 node) {
        Film12 current = head;
        int index = 0;
        while (current != null) {
            if (current == node) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Film12 tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id);
                System.out.println(" Judul Film : " + tmp.judulFilm);
                System.out.println(" ipk : " + tmp.rating);
                tmp = tmp.next;
            }

        } else {
            System.out.println("Daftar Film Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar Film Kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            System.out.println("Data film " + head.judulFilm + " berhasil dihapus");
            head = head.next;
            head.prev = null;
            size--;
        }

    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar Film Kosong");
        } else if (head.next == null) {
            System.out.println("Data film " + head.judulFilm + " berhasil dihapus");
            head = null;
            size--;
            return;
        }

        Film12 current = head;

        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("Data film " + current.next.judulFilm + " berhasil dihapus");
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar Film Kosong");
        } else if (index == 0) {
            removeFirst();
        } else {
            Film12 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            System.out.println("Data film " + current.judulFilm + " berhasil dihapus");
            if (current.next == null) {
                current.prev.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void bubbleSortDesc() {
        if (size > 1) {
            boolean swap;
            do {
                Film12 current = head;
                Film12 prev = null;
                Film12 next = head.next;
                swap = false;

                while (next != null) {
                    if (current.rating < next.rating) {
                        swap = true;
                        if (prev != null) {
                            Film12 temp = next.next;
                            prev.next = next;
                            next.next = current;
                            current.next = temp;
                        } else {
                            Film12 temp = next.next;
                            head = next;
                            next.next = current;
                            current.next = temp;
                        }
                        prev = next;
                        next = current.next;
                    } else {
                        prev = current;
                        current = next;
                        next = next.next;
                    }
                }
            } while (swap);
        }
    }

    public int findSeqSearchIdFilm(String id) {
        Film12 current = head;
        int index = 0;
        while (current != null) {
            if (current.id.equals(id)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void printSearch(String id) {
        Film12 current = head;
        while (current != null) {
            if (current.id.equals(id)) {
                System.out.println("ID: " + current.id);
                System.out.println("Judul Film: " + current.judulFilm);
                System.out.println("IMDB Rating: " + current.rating);
                return;
            }
            current = current.next;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

}
