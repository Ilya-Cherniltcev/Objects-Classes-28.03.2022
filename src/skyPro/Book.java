package skyPro;

import java.util.Objects;

public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.year = year;           // год издания книги
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга: " + title + ", год издания-" + year + ", автор-" + author;
    }

    @Override
    public boolean equals(Object some) {
        if (this == some) return true;
        if (some == null || getClass() != some.getClass()) return false;
        Book book = (Book) some;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
