package by.bsuir.Akentyeva.Task15.util;

import by.bsuir.Akentyeva.Task12.util.Book;
import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook){
        return Integer.compare(firstBook.getPrice(),
                secondBook.getPrice());
    }
}
