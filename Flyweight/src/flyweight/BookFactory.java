package flyweight;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static Map<String, BookFlyweight> factoryBookFlyweight = new HashMap<>();

    public static BookFlyweight getBookFlyweight(String author, String publisher) {
        String key = author + publisher;
        BookFlyweight flyweight = factoryBookFlyweight.get(key);

        if(flyweight == null) {
            flyweight = new BookFlyweight(author, publisher);
            factoryBookFlyweight.put(key, flyweight);
        } else {
            flyweight = factoryBookFlyweight.get(key);
        }

        return flyweight;
    }
}
