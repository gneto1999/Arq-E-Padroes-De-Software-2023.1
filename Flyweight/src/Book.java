import flyweight.BookFactory;
import flyweight.BookFlyweight;

import java.time.LocalDate;

public class Book {
    private String titulo;
    private LocalDate publishDate;
    private BookFlyweight bookFlyweight;

    public Book(String titulo, LocalDate publishDate, String author, String publisher) {
        this.titulo = titulo;
        this.publishDate = publishDate;
        this.bookFlyweight = BookFactory.getBookFlyweight(author, publisher);
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public BookFlyweight getBookFlyweight() {
        return bookFlyweight;
    }
}
