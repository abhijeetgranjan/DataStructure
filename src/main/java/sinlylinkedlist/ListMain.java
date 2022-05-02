package main.java.sinlylinkedlist;

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


        singlyLinkedList.getIndex(55);
        singlyLinkedList.getIndex(22);
        singlyLinkedList.getIndex(6633);
    }
}
