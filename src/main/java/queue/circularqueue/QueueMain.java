package main.java.queue.circularqueue;


public class QueueMain {

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(5);

        Student hp = new Student(1, "hp");
        Student compaq = new Student(2, "compaq");
        Student dell = new Student(3, "dell");
        Student lenovo = new Student(4, "lenovo");
        Student sony = new Student(5, "sony");


        queue.add(hp);
        queue.add(compaq);
        queue.add(dell);
        queue.add(lenovo);
        queue.add(sony);
        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.printQueue();


        queue.add(hp);
        queue.printQueue();
        queue.add(compaq);
        queue.printQueue();
        System.out.println(queue.getSize());
        queue.add(compaq);

    }
}
