import java.util.ArrayList;
import java.util.List;
public class Member {
    public String name;
    private final String memberId;
    private final List<Book> borrowedBooks;
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }
    public String getMemberId() {
        return memberId;
    }
    public void borrowBook(Book book) {
        addBookToBorrowedList(book);
    }
    private void addBookToBorrowedList(Book book) {
        borrowedBooks.add(book);}
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
