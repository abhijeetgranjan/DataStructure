package main.java.queue;

public class QueueMain {


    public static void main(String[] args) {
        QueueImpl queue= new QueueImpl(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        queue.print();

        queue.remove();
        queue.remove();
        System.out.println(queue.peek());

        queue.print();
    }
}
