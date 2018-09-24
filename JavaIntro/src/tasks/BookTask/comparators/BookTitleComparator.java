package tasks.BookTask.comparators;

import tasks.BookTask.entities.Book;
import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        return firstBook.getTitle()
                .compareTo(secondBook.getTitle());
    }
}