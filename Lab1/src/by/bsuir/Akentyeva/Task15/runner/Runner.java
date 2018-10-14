package by.bsuir.Akentyeva.Task15.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task12.util.Book;
import by.bsuir.Akentyeva.Task15.util.BookAuthorComparator;
import by.bsuir.Akentyeva.Task15.util.BookPriceComparator;
import by.bsuir.Akentyeva.Task15.util.BookTitleComparator;

import java.util.*;

public class Runner {
    private static Map<String, Comparator<Book>> comparators = new HashMap<>();

    public static void main(String[] args) {
        Book book1 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams",
                20, 330258648, 1);
        Book book2 = new Book("Wuthering Heights", "Emily Brontë",
                10, 393978893, 2);
        Book book3 = new Book("The Curious Case of Benjamin Button", "F.Scott Fitzgerald",
                30, 474778891, 3);
        Book book4 = new Book("The Thirteenth Tale", "Diane Setterfield",
                14, 121342433, 4);
        Book book5 = new Book("Brave new world", "Aldous Huxley",
                12, 131435463, 5);
        Book book6 = new Book("Animal farm", "George Orwell",
                24, 455475311, 6);
        Book book7 = new Book("Brave new world", "Aldous Huxley",
                15, 131477299, 7);
        Book book8 = new Book("Cloud Atlas", "David Mitchell",
                15, 131151682, 8);
        Book book9 = new Book("Cloud Atlas", "Liam Callanan",
                15, 131151682, 89);
        Book[] books = new Book[] {book6, book1, book2, book5, book4, book3, book9, book8};


        comparators.put("Title sort", new BookTitleComparator());
        comparators.put("Title then author sort",
                new BookTitleComparator()
                        .thenComparing(new BookAuthorComparator()));
        comparators.put("Author then title sort",
                new BookAuthorComparator()
                        .thenComparing(new BookTitleComparator()));
        comparators.put("Author then title then price sort",
                new BookAuthorComparator()
                        .thenComparing(new BookTitleComparator())
                        .thenComparing(new BookPriceComparator()));

        printSorts(books);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Current book order:");
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
    }

    private static void printSorts(Book[] books) {
        printBooks(books);

        for (Map.Entry<String, Comparator<Book>> entry : comparators.entrySet())
        {
            System.out.println(entry.getKey());
            Arrays.sort(books, entry.getValue());
            printBooks(books);
        }
    }
}
