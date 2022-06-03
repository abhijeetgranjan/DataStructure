package main.java.singlylinkedlist;

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
        System.out.println(" *** Printing linked list ***");
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
        System.out.println(" ");
        System.out.println("*** Printed the list ***");
    }

    public void getIndex(int value) {

        if (getSize() == 0) {
            System.out.println("element not present in list");
        } else {
            int index = 1;
            curr = head;
            if (curr.getValue() == value) {
                System.out.println(" the index is " + index);

            } else {
                while (curr.getNext() != null) {
                    if (curr.getValue() == value) {
                        System.out.println(" the index is " + index);
                        return;
                    } else {
                        curr = curr.getNext();
                        index++;
                    }
                }
                System.out.println(" element not present in list");
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void reverseLinkedList() {

        curr = head;
        Node prev = null;

        while(curr!=null){
            Node temp = curr.getNext();
            curr.setNext(prev);
            prev= curr;
            curr= temp;
        }
        head= prev;
    }
}
