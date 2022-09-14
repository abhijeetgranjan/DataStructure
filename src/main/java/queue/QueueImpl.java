package main.java.queue;

public class QueueImpl {

    private int[] queue;
    private int top;
    private int front=0;

    QueueImpl(int capacity){
        queue = new int[capacity];
    }

    public void add (int value){
        if(top == queue.length-1){
            System.out.println("queue is full ");
        }
        queue[top++] = value;
    }

    public int remove(){
        int removedElement = queue[front];
        front++;
        return removedElement;
    }

    public int peek(){
        return queue[front];
    }

    public void print(){
        for (int i = front; i < top; i++) {
            System.out.print("| ");
            System.out.print(queue[i] +" |");
        }
        System.out.println();
    }
}
