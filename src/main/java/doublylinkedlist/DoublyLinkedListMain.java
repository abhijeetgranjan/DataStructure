package main.java.doublylinkedlist;

public class DoublyLinkedListMain {
    public static void main(String[] args) {


        DoublyLinkedList linkedList= new DoublyLinkedList();

        linkedList.addToFront(5);
        linkedList.addToFront(6);
        linkedList.addToFront(8);

        linkedList.sizeOfList();
        linkedList.printList();


        linkedList.addToLast( 9);
        linkedList.addToLast(10);
        linkedList.addToLast(11);

        System.out.println(" ");
        linkedList.sizeOfList();
        linkedList.printList();

        System.out.println(" ");
        linkedList.getIndex(89);
        linkedList.getIndex(8);
        linkedList.getIndex(9);

    }
}
