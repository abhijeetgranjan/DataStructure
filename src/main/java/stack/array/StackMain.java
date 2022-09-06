package main.java.stack.array;

public class StackMain {
    public static void main(String[] args) {

        StackImpl stack = new StackImpl(5);

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.printStack();


        System.out.println(" "+stack.peek());


        System.out.println(" "+ stack.pop());

        System.out.println();
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
        stack.printStack();

    }
}
