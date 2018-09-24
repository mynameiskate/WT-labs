package tasks.BookTask.comparators;

import tasks.BookTask.entities.Book;
import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        return Integer.compare(firstBook.getPrice(),
                secondBook.getPrice());
    }
}
