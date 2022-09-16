package main.java.queue;


import java.util.Scanner;

public class QueueUsingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueImpl queue = new QueueImpl(10);
        int choice = takeInputFromUser();

        do {
            switch (choice) {
                case 1:
                    System.out.println(" enter the element to add to queue ");
                    int element = sc.nextInt();
                    queue.add(element);
                    choice = takeInputFromUser();
                    break;

                case 2:
                    System.out.println(" " + queue.remove());
                    choice = takeInputFromUser();
                    break;

                case 3:
                    System.out.println(" " + queue.peek());
                    choice = takeInputFromUser();
                    break;

                case 4:
                    queue.print();
                    choice = takeInputFromUser();
                    break;

                default:
                    System.out.println(" operation completed by the user");
                    break;

            }

        } while (choice>=1 && choice<5);

    }

    static int takeInputFromUser() {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please select the operations from below");
        System.out.println(" 1.) To Add elements in the queue ");
        System.out.println(" 2.) To remove elements from the queue ");
        System.out.println(" 3.) To peek the top most element of the queue ");
        System.out.println(" 4.) To print the elements of the queue");
        System.out.println(" 5.) exit");
        System.out.println(" Enter your choice ");

        return sc.nextInt();
    }

}
