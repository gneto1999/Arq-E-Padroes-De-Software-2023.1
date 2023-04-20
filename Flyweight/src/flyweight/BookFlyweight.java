package flyweight;

public class BookFlyweight {
    private String author;
    private String publisher;

    BookFlyweight(String author, String publisher) {
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}
