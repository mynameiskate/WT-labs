package tests;

import org.junit.Test;
import tasks.BookTask.entities.Book;

import static org.junit.Assert.*;

public class BookSortTest {

    @Test
    public void testSort() {
        Book book1 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams",
                20, 330258648, 1);
        Book book2 = new Book("Wuthering Heights", "Emily Brontë",
                10, 393978893, 2);
        Book book3 = new Book("The Curious Case of Benjamin Button", "F.Scott Fitzgerald",
                30, 474778891, 3);

        assertEquals(book1, book1.clone());
    }
}
