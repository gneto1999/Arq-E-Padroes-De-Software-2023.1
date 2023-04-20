import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book b1 = new Book(
                "Arquitetura e Organização de Computadores",
                LocalDate.parse("2017-09-15"),
                "William Stallings",
                "Pearson"
        );

        Book b2 = new Book(
                "JAVA: Como Programar",
                LocalDate.parse("2016-06-24"),
                "Paul Deitel",
                "Pearson"
        );

        Book b3 = new Book(
                "C: Como Programar",
                LocalDate.parse("2011-06-25"),
                "Paul Deitel",
                "Pearson"
        );

        books.add(b1);
        books.add(b2);
        books.add(b3);

        for (Book book : books) {
            System.out.println(
                    book.getTitulo() + ", " +
                    book.getBookFlyweight().getAuthor() + ", " +
                    book.getBookFlyweight().getPublisher() + ", " +
                    book.getPublishDate()
            );
        }
    }
}