package tests;

import org.junit.Test;
import tasks.BookTask.comparators.BookAuthorComparator;
import tasks.BookTask.comparators.BookPriceComparator;
import tasks.BookTask.comparators.BookTitleComparator;
import tasks.BookTask.entities.Book;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.assertArrayEquals;


public class BookSortTest {

    private Book[] novels;
    private Book[] dystopias;
    private Book[] allBooks;
    private Comparator<Book> comparator;

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

    public BookSortTest() {
        allBooks = new Book[] {book6, book1, book2, book5, book4, book3, book9, book8};
        dystopias = new Book[] {book6, book5, book7};
        novels =  new Book[] {book1, book2, book4, book5, book9, book8};
    }

    @Test
    public void testTitleSort() {
        comparator = new BookTitleComparator();
        Arrays.sort(novels, comparator);
        assertArrayEquals(new Book[] {book5, book9, book8, book1, book4, book2}, novels);

        System.out.println("\r\nSort by title:");
        printBookArray(novels);
    }

    @Test
    public void testTitleAndAuthorSort() {
        comparator = new BookTitleComparator()
                .thenComparing(new BookAuthorComparator());

        Arrays.sort(dystopias, comparator);
        assertArrayEquals(new Book[] {book6, book5, book7}, dystopias);
        System.out.println("\r\nSort by title & author:");
        printBookArray(dystopias);

        Arrays.sort(novels, comparator);
        assertArrayEquals(new Book[] {book5, book8, book9, book1, book4, book2}, novels);
        System.out.println("\r\nSort by title & author:");
        printBookArray(novels);
    }

    @Test
    public void testAuthorAndTitleSort() {
        comparator = new BookAuthorComparator()
                .thenComparing(new BookTitleComparator());

        Arrays.sort(novels, comparator);
        assertArrayEquals(new Book[] {book5, book8, book4, book1, book2, book9}, novels);
        System.out.println("\r\nSort by author & title:");
        printBookArray(novels);
    }

    @Test
    public void testAuthorTitleAndPriceSort() {
        comparator = new BookAuthorComparator()
                .thenComparing(new BookTitleComparator())
                .thenComparing(new BookPriceComparator());

        Arrays.sort(novels, comparator);
        assertArrayEquals(new Book[] {book5, book8, book4, book1, book2, book9}, novels);
        System.out.println("\r\nSort by author, title & price:");
        printBookArray(novels);
    }

    private void printBookArray(Book[] books) {
        for(Book book: books) {
            System.out.println(book);
        }
    }
}
