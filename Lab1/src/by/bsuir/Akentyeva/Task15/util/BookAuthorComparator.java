package by.bsuir.Akentyeva.Task15.util;

import java.util.Comparator;
import by.bsuir.Akentyeva.Task12.util.Book;

public class BookAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        return firstBook.getAuthor()
                .compareTo(secondBook.getAuthor());
    }
}
