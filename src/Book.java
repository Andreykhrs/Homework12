public class Book {
    private String bookTitle;
    private Author nameOfAuthor;
    private int yearOfPublished;

    public Book(String bookTitle, Author nameOfAuthor, int yearOfPublished) {
        this.bookTitle = bookTitle;
        this.nameOfAuthor = nameOfAuthor;
        this.yearOfPublished = yearOfPublished;

    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getNameOfAuthor() {
        return this.nameOfAuthor;
    }

    public int getYearOfPublished() {
        return this.yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }


}
