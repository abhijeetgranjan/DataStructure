package main.java.queue.circularqueue;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return
                 id +
                "," + name ;

    }
}
