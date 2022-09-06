package main.java.stack.array;

public class StackImpl {

    private int[] stack;
    private int top;

    public StackImpl(int capacity) {
        stack = new int[capacity];
    }

    public void push(int value) {
        if (getSize() == stack.length) {
            System.out.println(" stack is full reinitializing the stack");
            int [] newStack = new int[2 * stack.length];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack = newStack;

        }

        stack[top++] = value;
    }

    public int pop() {
        System.out.println(" removing the element ");
        if (isEmpty()) {
            System.out.println(" stack is empty");
            return -1;
        }

        return stack[--top];
    }

    public int peek() {
        System.out.println(" peeking the element ");
        if (isEmpty()) {
            System.out.println(" stack is empty");
            return -1;
        }

        return stack[top - 1];
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println(" nothing to print ");
        } else {

            System.out.println(" ----- ");

            for (int i = top - 1; i >= 0; i--) {
                System.out.println(" | "+stack[i]+" | ");
                System.out.println(" ----- ");
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int getSize(){
        return top;
    }
}
