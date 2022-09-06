package main.java.stack.array;

public class StackMain {
    public static void main(String[] args) {

        StackImpl stack = new StackImpl(5);

        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        stack.add(9);
        stack.add(10);
        stack.printStack();


        System.out.println(" "+stack.peek());


        System.out.println(" "+ stack.remove());

        System.out.println();
        stack.printStack();
        stack.remove();
        stack.remove();
        stack.remove();
        System.out.println();
        stack.printStack();

    }
}
