package by.bsuir.Akentyeva.Task13.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task12.util.Book;
import by.bsuir.Akentyeva.Task13.util.ProgrammerBook;

public class Runner {
    public static void main(String[] args) {
        ProgrammerBook book1 = createBook();
        ProgrammerBook book2 = createBook();

        System.out.println("Your first book:");
        System.out.println(book1);

        System.out.println("Your second book:");
        System.out.println(book2);

        System.out.println(String.format("These books are equal: %b", book1 == book2));
    }

    private static ProgrammerBook createBook() {
        System.out.println("Let's create a book!");
        System.out.println("Enter book title: ");
        String title = DataScanner.getStringFromConsole();
        System.out.println("Enter book author: ");
        String author = DataScanner.getStringFromConsole();
        System.out.println("Enter book price: ");
        int price = DataScanner.getNonNegativeIntFromConsole();
        System.out.println("Enter book edition: ");
        int edition = DataScanner.getIntFromConsole();
        System.out.println("Enter book ISBN: ");
        int isbn = DataScanner.getIntFromConsole();
        System.out.println("Enter book language: ");
        String language = DataScanner.getStringFromConsole();
        System.out.println("Enter book level: ");
        int level = DataScanner.getNonNegativeIntFromConsole();

        return new ProgrammerBook(title, author, price, edition, isbn, language, level);
    }
}
