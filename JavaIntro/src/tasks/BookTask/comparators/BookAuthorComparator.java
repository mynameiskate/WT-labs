package tasks.BookTask.comparators;

import tasks.BookTask.entities.Book;
import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        return firstBook.getAuthor()
                .compareTo(secondBook.getAuthor());
    }
}
