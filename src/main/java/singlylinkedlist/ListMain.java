package main.java.singlylinkedlist;

public class ListMain {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addToLast(11);
        singlyLinkedList.addToLast(22);
        singlyLinkedList.addToLast(33);
        singlyLinkedList.addToLast(44);
        singlyLinkedList.addToFront(55);

        System.out.println("the size of list is " + singlyLinkedList.getSize());

        singlyLinkedList.printLinkedList();

        singlyLinkedList.addAtIndex(66,1);
        singlyLinkedList.printLinkedList();

        singlyLinkedList.addAtIndex(100,7);
        singlyLinkedList.printLinkedList();

        singlyLinkedList.addAtIndex(111,4);
        singlyLinkedList.printLinkedList();

        singlyLinkedList.getIndex(55);
        singlyLinkedList.getIndex(22);
        singlyLinkedList.getIndex(6633);


        singlyLinkedList.reverseLinkedList();
        singlyLinkedList.printLinkedList();
    }
}
