package lesson3.Books;

public class BookUtils {
    public void booksReach (Book book1, Book book2) {
        if (book1.getCena()>book2.getCena()) {
            book1.printInfo();

        }
        else book2.printInfo();
    }
    public void bookCheap(Book book1, Book book2) {
        if (book1.getCena()<book2.getCena()) {
            book1.printInfo();

        }
        else book2.printInfo();
    }
}
