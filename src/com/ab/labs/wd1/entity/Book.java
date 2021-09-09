package com.ab.labs.wd1.entity;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private String isbn;
    private static int edition;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public Book(Book book) {
        title = book.title;
        author = book.author;
        price = book.price;
        isbn = book.isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Book b = (Book) o;

        return this.title.equals(b.title)
                && this.author.equals(b.author)
                && this.price == b.price
                && this.isbn.equals(b.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return String.format("title=%s author=%s price=%d isbn=%s", title, author, price, isbn);
    }

    @Override
    public Book clone() {
        return new Book(this);
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}
