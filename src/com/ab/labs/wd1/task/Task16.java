package com.ab.labs.wd1.task;

import com.ab.labs.wd1.entity.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task16 implements LabTask {
    @Override
    public void execute() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("BB", "D", 142, "3-4545-2345-5"));
        books.add(new Book("A", "B", 120, "2-3556-3234-2"));
        books.add(new Book("F", "A", 154, "3-5678-3334-6"));
        books.add(new Book("G", "B", 123, "5-6643-5665-7"));
        books.add(new Book("C", "A", 154, "2-5743-6774-6"));
        books.add(new Book("D", "D", 153, "7-2325-7543-5"));
        books.add(new Book("BA", "C", 142, "3-4545-2345-5"));
        books.add(new Book("B", "C", 132, "1-3436-3753-7"));
        books.add(new Book("C", "A", 144, "2-5743-6774-6"));
        books.add(new Book("E", "C", 147, "2-3434-6896-4"));

        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
        Comparator<Book> titleAndAuthorComparator = Comparator.comparing(Book::getTitle)
                .thenComparing(Book::getAuthor);
        Comparator<Book> authorAndTitleComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle);
        Comparator<Book> authorTitleAndPriceComparator = Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle).thenComparing(Book::getPrice);

        System.out.println("Before sorting:");
        books.forEach(System.out::println);

        books.sort(titleComparator);
        System.out.println("Sorted by title:");
        books.forEach(System.out::println);

        books.sort(titleAndAuthorComparator);
        System.out.println("Sorted by title, then author:");
        books.forEach(System.out::println);

        books.sort(authorAndTitleComparator);
        System.out.println("Sorted by author, then title:");
        books.forEach(System.out::println);

        books.sort(authorTitleAndPriceComparator);
        System.out.println("Sorted by author, then title, then price:");
        books.forEach(System.out::println);
    }
}
