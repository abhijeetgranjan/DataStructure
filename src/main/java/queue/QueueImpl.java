package main.java.queue;

import java.util.NoSuchElementException;

public class QueueImpl {

    private int[] queue;
    private int top;
    private int front = 0;

    QueueImpl(int capacity) {
        queue = new int[capacity];
    }

    public void add(int value) {
        if (top == queue.length) {
            System.out.println("queue is full ");
            return;
        }
        queue[top++] = value;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println(" queue is empty");
            return -1;
        }

        int removedElement = queue[front];
        front++;
        if(isEmpty()){
            top=0;
            front=0;
        }
        return removedElement;
    }

    public boolean isEmpty() {
        return top - front == 0;
    }

    public int getSize(){
        return  top- front;
    }

    public int peek() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public void print() {
        for (int i = front; i < top; i++) {
            System.out.print("| ");
            System.out.print(queue[i] + " |");
        }
        System.out.println();
    }
}
