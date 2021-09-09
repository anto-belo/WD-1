package com.ab.labs.wd1.task;

import com.ab.labs.wd1.entity.Book;

public class Task14 implements LabTask {
    @Override
    public void execute() {
        Book b = new Book("Book", "A.B.", 120, "0-0000-0000-0");
        Book b1 = b.clone();

        System.out.println("1. " + b);
        System.out.println("1-clone: " + b1);
        System.out.println("b == b1: " + (b == b1));
        System.out.println("b.equals(b1): " + b.equals(b1));
    }
}
