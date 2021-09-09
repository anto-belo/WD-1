package com.ab.labs.wd1.task;

import com.ab.labs.wd1.entity.Book;

public class Task12 implements LabTask {
    @Override
    public void execute() {
        Book b1 = new Book("A", "A.B.", 120, "0-0000-0000-0");
        Book b2 = new Book("A", "A.B.", 120, "0-0000-0000-0");
        Book b3 = new Book("B", "A.B.", 100, "0-0000-0000-0");

        System.out.println("\n1. " + b1 + " (hash: " + b1.hashCode() + ")");
        System.out.println("2. " + b2 + " (hash: " + b2.hashCode() + ")");
        System.out.println("3. " + b3 + " (hash: " + b3.hashCode() + ")");

        System.out.println("b1 == b2: " + (b1 == b2));
        System.out.println("b1.equals(b2): " + b1.equals(b2));
        System.out.println("b1.equals(b3): " + b1.equals(b3));
    }
}
