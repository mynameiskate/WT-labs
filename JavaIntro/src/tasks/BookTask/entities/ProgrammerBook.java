package tasks.BookTask.entities;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price,
                          int edition, int isbn, String language, int level) {
        super(title, author, price, edition, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        return super.hashCode() | language.hashCode() | level;
    }

    @Override
    public boolean equals(Object obj){
        if (super.equals(obj)) {
            ProgrammerBook anotherBook = (ProgrammerBook) obj;

            return (anotherBook.language == this.language)
                    && (anotherBook.level == this.level);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d",
                super.toString(), language, level);
    }


}
