package tasks.BookTask.entities;

public class Book implements Cloneable, Comparable<Book> {
    private Integer isbn;
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author,
                int price, int edition, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public Book() {}

    @Override
    public int hashCode() {
        return title.hashCode() | author.hashCode() | price | edition;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %d",
                this.title, this.author, this.price, this.edition);
    }

    @Override
    public boolean equals(Object obj){
        if ((obj == null) || !(obj instanceof Book)) {
            return false;
        }

        if (obj == this){
            return true;
        }

        Book anotherBook = (Book) obj;

        return (this.title == anotherBook.title)
        && (this.author == anotherBook.author)
        && (this.price == anotherBook.price)
        && (this.edition == anotherBook.edition);
    }

    @Override
    public Book clone() {
        return new Book(title, author, price, edition, isbn);
    }

    public int compareTo(Book anotherBook){
        return isbn.compareTo(anotherBook.isbn);
    }

}
