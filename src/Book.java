import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int yearOfPublished;

    public Book(String bookTitle, Author nameOfAuthor, int yearOfPublished) {
        this.bookTitle = bookTitle;
        this.author = nameOfAuthor;
        this.yearOfPublished = yearOfPublished;

    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getNameOfAuthor() {
        return this.author;
    }

    public int getYearOfPublished() {
        return this.yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author=" + author +
                ", yearOfPublished=" + yearOfPublished +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublished == book.yearOfPublished && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, yearOfPublished);
    }
}
