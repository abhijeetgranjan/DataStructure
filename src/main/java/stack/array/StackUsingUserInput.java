package main.java.stack.array;

import java.util.Scanner;

public class StackUsingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackImpl stack = new StackImpl(5);
        int choice = takeInputFromUser();
     

        do {
            switch (choice) {
                case 1:
                    System.out.println(" enter the element to add to stack ");
                    int capacity = sc.nextInt();
                    stack.push(capacity);
                    choice = takeInputFromUser();
                    break;

                case 2:
                    System.out.println(" "+ stack.pop());
                    choice = takeInputFromUser();
                    break;

                case 3:
                    System.out.println(" "+ stack.peek());
                    choice = takeInputFromUser();
                    break;

                case 4:
                    stack.printStack();
                    choice = takeInputFromUser();
                    break;

                default:
                    System.out.println(" operation completed by the user");
                    break;

            }
        }while(choice!=5);
    }

    static int takeInputFromUser(){

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please select the operations from below");
        System.out.println(" 1.) To Add/push elements in the stack ");
        System.out.println(" 2.) To remove/pop elements from the stack ");
        System.out.println(" 3.) To peek the top most element of the stack ");
        System.out.println(" 4.) To print the elements of the stack");
        System.out.println(" 5.) exit");
        System.out.println(" Enter your choice ");

        return sc.nextInt();
    }
}
