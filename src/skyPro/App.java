package skyPro;

public class App {
    public static void main() {
        Author author1 = new Author("Александр", "Дюма");
        Author author2 = new Author("Татьяна", "Бочкова");
        Book book1 = new Book("Три мушкетера", author1, 1958);
        Book book2 = new Book("Три мушкетера", author1, 1957);
        Book book3 = new Book("Обратная строна луны", author2,2015);
        //      book1.setYear(2022);
        //      System.out.println("Измененный год первой книги: " + book1.getYear());
        System.out.println(book1);
        System.out.println(book2);
  // Сравниваем на равенство 2 книги
        boolean sEquals = book1.equals(book2);
        if (sEquals) {
            System.out.println("Эти книги одинаковые");
        } else {
            System.out.println("Эти книги НЕодинаковые");
        }


    }
}
