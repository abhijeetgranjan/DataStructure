package main.java.queue.circularqueue;

import java.util.NoSuchElementException;

public class QueueImpl {
    private Student[] queue;
    private int back;
    private int front;

    public QueueImpl(int capacity) {
        queue = new Student[capacity];
    }

    public void add(Student student) {
        if (getSize() == queue.length  ) {
            System.out.println(" stack is full");
        }
        if (back < queue.length ) {
            queue[back] = student;
            back++;
        } else {
            back = 0;
            queue[back++] = student;
        }
    }

    public Student remove() {
        if (getSize() == 0) {
            throw new NoSuchElementException();
        }
        Student student = queue[front];
        queue[front] = null;
        front++;
        if (getSize() == 0) {
            front = 0;
            back = 0;
        }
        if (front == queue.length) {
            front = 0;
        }
        return student;
    }

    public int getSize() {
        if(front==back && back==0){
            return 0;
        }
        if (front < back) {
            return back - front;
        }
        return back - front + queue.length;
    }


    public void printQueue() {
        if (front < back) {
            for (int i = front; i < back; i++) {
                System.out.print("| ");
                System.out.print(queue[i] + " |");
            }
            System.out.println();
        } else {
            System.out.println();
            for (int i = front; i < queue.length; i++) {
                System.out.print("| ");
                System.out.print(queue[i] + " |");
            }
            for (int i = 0; i < back; i++) {
                System.out.print("| ");
                System.out.print(queue[i] + " |");
            }
        }
    }
}
