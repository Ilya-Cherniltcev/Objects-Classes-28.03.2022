package skyPro;

public class App {
    public static void main() {
        Author author1 = new Author("Александр", "Дюма");
        Author author2 = new Author("Татьяна", "Бочкова");
        Book book1 = new Book("Три мушкетера", author1, 1958);
        Book book2 = new Book("Обратная строна луны", author2,2015);
        System.out.println("Первая книга: " + book1.getTitle() + ", автор " + author1.getName() + " " + author1.getSurname() + ", " + book1.getYear());
        System.out.println("Вторая книга: " + book2.getTitle() + ", автор " + author2.getName() + " " + author2.getSurname() + ", " + book2.getYear());
        book1.setYear(2022);
        System.out.println("Измененный год первой книги: " + book1.getYear());
    }
}
