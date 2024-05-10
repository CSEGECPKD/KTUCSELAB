/*
A college library is computerised  few year back. Ther have Defined a class `Book` with the following attributes: `title`, `author`, `isbn`, and `availableCopies`. Appropriate methods (getbookdetails() and setbookdetails()) for getting and setting these attributes are also implemented.  Now they want to add two more attributes category and edition no. Extend the class to add these attributes and also override the getbookdetails() and setbookdetails() to include these newly attributes.
*/
class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected int availableCopies;

    public void setBookDetails(String title, String author, String isbn, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    public String getBookDetails() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available Copies: " + availableCopies;
    }
}

class ExtendedBook extends Book {
    private String category;
    private int editionNo;

    @Override
    public void setBookDetails(String title, String author, String isbn, int availableCopies) {
        super.setBookDetails(title, author, isbn, availableCopies);
    }

    public void setBookDetails(String title, String author, String isbn, int availableCopies, String category, int editionNo) {
        super.setBookDetails(title, author, isbn, availableCopies);
        this.category = category;
        this.editionNo = editionNo;
    }

    @Override
    public String getBookDetails() {
        return super.getBookDetails() + ", Category: " + category + ", Edition No: " + editionNo;
    }
}