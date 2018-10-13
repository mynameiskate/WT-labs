package by.bsuir.Akentyeva.Task12.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task12.util.Book;

public class Runner {
    public static void main(String[] args) {
        Book book1 = createBook();
        Book book2 = createBook();

        System.out.println("Your first book:");
        System.out.println(book1);

        System.out.println("Your second book:");
        System.out.println(book2);

        System.out.println(String.format("These books are equal: %b", book1 == book2));
    }

    private static Book createBook() {
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

        return new Book(title, author, price, edition, isbn);
    }
}
