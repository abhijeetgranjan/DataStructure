package main.java.sinlylinkedlist;

public class SinglyLinkedList {
    private Node head, curr;
    private int size;

    public void addToLast(int value) {
        if (head == null) {
            Node node = new Node(value);
            head = node;
            curr = node;
            size++;
        } else {
            Node node = new Node(value);
            curr.setNext(node);
            curr = node;
            size++;
        }
    }

    public void addToFront(int value) {
        if (head == null) {
            Node node = new Node(value);
            head = node;
            curr = node;
            size++;
        } else {
            Node node = new Node(value);
            node.setNext(head);
            head = node;
            size++;
        }
    }

    public void printLinkedList() {
        if (getSize() == 0) {
            System.out.println("the list is empty");
        } else {
            curr = head;
            System.out.print(head.getValue());
            while (curr.getNext() != null) {
                curr = curr.getNext();
                System.out.print(" --> " + curr.getValue());

            }
        }

    }

    public int getSize() {
        return size;
    }
}
