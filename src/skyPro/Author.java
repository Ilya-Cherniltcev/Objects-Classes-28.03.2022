package skyPro;

import java.util.Objects;

public class Author {
    public String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object some) {
        if (this == some) return true;
        if (some == null || getClass() != some.getClass()) return false;
        Author author = (Author) some;
        return Objects.equals(name, author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
