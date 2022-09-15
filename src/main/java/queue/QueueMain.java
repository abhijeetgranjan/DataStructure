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
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        queue.print();

        queue.remove();
        queue.remove();



        //System.out.println(queue.peek());
        queue.add(11);
        System.out.println(queue.getSize());
        queue.print();

    }
}
