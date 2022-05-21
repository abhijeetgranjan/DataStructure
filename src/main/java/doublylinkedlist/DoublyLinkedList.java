package main.java.doublylinkedlist;

public class DoublyLinkedList {

    private DoublyNode head, tail, curr;
    private int size;

    public void addToFront(int value) {
        DoublyNode node = new DoublyNode(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.setPrev(node);
            head = node;
            head.setNext(curr);
        }
        curr = node;
        size++;
    }

    public void addToLast(int value) {
        DoublyNode node = new DoublyNode(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
            tail.setPrev(curr);
        }
        size++;
        curr = node;
    }

    public void sizeOfList() {
        System.out.println(" the size of list is " + size);
    }

    public void printList() {
        if (head == null) {
            System.out.println(" No element in the list");
        } else {
            curr = head;
            System.out.print(curr.getValue());
            while (curr.getNext() != null) {
                curr = curr.getNext();
                System.out.print(" --> " + curr.getValue());
            }
        }
    }

    public void getIndex(int value) {

        int index = 1;
        if (head == null) {
            System.out.println(" the list is empty");
        } else {
            curr = head;
            if (curr.getValue() == value) {
                System.out.println(" the element " + value + " is present at index " + index);
            } else {
                while (curr!= null) {

                    if (curr.getValue() == value) {
                        System.out.println(" the element " + value + " is present at index " + index);
                        return;
                    }index++;
                    curr = curr.getNext();
                }
                System.out.println(" the element "+ value+" is not present in the list");
            }
        }

    }
}
