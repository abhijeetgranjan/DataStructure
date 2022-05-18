package main.java.doublylinkedlist;

public class DoublyLinkedListMain {
    public static void main(String[] args) {

        DoublyLinkedList linkedList= new DoublyLinkedList();
        linkedList.addToFront(5);
        linkedList.addToFront(6);
        linkedList.addToFront(8);

        linkedList.sizeOfList();

        linkedList.printList();
    }
}
