package main.java.doublylinkedlist;

public class DoublyLinkedList {

    private DoublyNode head, tail,curr;
    private int size;

    public void addToFront(int value){
        DoublyNode node = new DoublyNode(value);
        if(head==null){
            head= node;
            tail=node;
        }else{
            head.setPrev(node);
            head= node;
            head.setNext(curr);
        }
        curr=node;
        size++;
    }

    public void sizeOfList(){
        System.out.println(" the size of list is "+size);
    }

    public void printList(){
        if(head==null){
            System.out.println(" No element in the list");
        }else{
            curr = head;
            System.out.print(curr.getValue());
            while(curr.getNext()!=null){
                curr=curr.getNext();
                System.out.print(" --> "+curr.getValue());
            }
        }
    }
}
