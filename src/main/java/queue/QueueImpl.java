package main.java.queue;

import java.util.NoSuchElementException;

public class QueueImpl {

    private int[] queue;
    private int back;
    private int front = 0;

    public QueueImpl(int capacity) {
        queue = new int[capacity];
    }

    public void add(int value) {
        if (back == queue.length) {
            int newQueue[]= new int[2* queue.length];
            System.arraycopy(queue,0,newQueue,0, queue.length);
            queue=newQueue;
        }
        queue[back++] = value;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println(" queue is empty");
            return -1;
        }

        int removedElement = queue[front];
        front++;
        if(isEmpty()){
            back=0;
            front=0;
        }
        return removedElement;
    }

    public boolean isEmpty() {
        return back - front == 0;
    }

    public int getSize(){
        return  back- front;
    }

    public int peek() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public void print() {
        for (int i = front; i < back; i++) {
            System.out.print("| ");
            System.out.print(queue[i] + " |");
        }
        System.out.println();
    }
}
