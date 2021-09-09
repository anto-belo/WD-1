package com.ab.labs.wd1.entity;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private final String language;
    private final int level;

    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public ProgrammerBook(Book book, String language, int level) {
        super(book);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null
                || this.getClass() != o.getClass()
                || !super.equals(o)) return false;

        ProgrammerBook b = (ProgrammerBook) o;
        return language.equals(b.language)
                && level == b.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return String.format("%s language=%s level=%d", super.toString(), language, level);
    }
}
