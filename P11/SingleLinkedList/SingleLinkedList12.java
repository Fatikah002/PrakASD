package P11.SingleLinkedList;

public class SingleLinkedList12 {
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
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    void addFirst(int input) {
        Node12 ndInput = new Node12(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;

        }
    }

    void addLast(int input) {
        Node12 ndInput = new Node12(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node12 ndInput = new Node12(input, head);
        Node12 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        Node12 ndInput = new Node12(input, null);
        if (index < 0) {
            System.out.println("perbaiki logikanya!" + "kalau indeksnya -1 bagaimana ??? ");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node12 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
                temp.next = new Node12(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }

        }
    }

}
