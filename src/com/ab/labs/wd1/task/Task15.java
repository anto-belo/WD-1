package com.ab.labs.wd1.task;

import com.ab.labs.wd1.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Task15 implements LabTask {
    @Override
    public void execute() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("AAA", "A.B.", 120, "2-3556-3234-2"));
        books.add(new Book("BBB", "A.B.", 130, "1-3436-3753-7"));
        books.add(new Book("CCC", "A.B.", 140, "2-5743-6774-6"));
        books.add(new Book("DDD", "A.B.", 150, "7-2325-7543-5"));

        System.out.println("Before sorting by isbn:");
        books.forEach(System.out::println);
        System.out.println("After sorting by isbn:");
        books.stream().sorted().forEach(System.out::println);
    }
}
