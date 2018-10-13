package by.bsuir.Akentyeva.Task13.test;

import by.bsuir.Akentyeva.Task13.util.ProgrammerBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BookOverrideTest {

    @Test
    public void testEquality() {
        ProgrammerBook book1 = new ProgrammerBook("Clean code", "Robert C. Martin",
                20, 330258648, 1, "-", 2);
        ProgrammerBook book2 = new ProgrammerBook("Computer Networks: Principles, Technologies and Protocols for Network Design",
                "Natalia Olifer, Victor Olifer", 40, 1, 470869828, "-", 3);
        ProgrammerBook book3 = new ProgrammerBook("C, the complete reference", "Herb Schildt",
                4, 1, 13132,"C", 2);

        assertFalse(book1 == book2);
        assertEquals(book1, new ProgrammerBook("Clean code", "Robert C. Martin",
                20, 330258648, 1, "-", 2));
        assertFalse(book3 == new ProgrammerBook("Clean code", "Robert C. Martin",
                20, 330258648, 1, "-", 2));
    }
}
