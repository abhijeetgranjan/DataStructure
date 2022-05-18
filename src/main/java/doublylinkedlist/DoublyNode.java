package main.java.doublylinkedlist;

public class DoublyNode {
    private DoublyNode node;
    private int value;
    private DoublyNode next;
    private DoublyNode prev;

    public DoublyNode() {
    }

    public DoublyNode(int value) {
        this.value = value;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public DoublyNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
