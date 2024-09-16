import java.util.ArrayList;
import java.util.List;
public class Library {
    private final List<Book> books;
    private final List<Member> members;
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public void lendBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberById(memberId);

        if (book != null && member != null && book.getCopiesAvailable() > 0) {
            member.borrowBook(book);
            book.setCopiesAvailable(book.getCopiesAvailable() - 1);
            System.out.println("Book lent successfully.");
        } else {
            System.out.println("Book or member not found or book not available.");
        }
    }
    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
}
class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991", 5);
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 3);
        library.addBook(book1);
        library.addBook(book2);
        Member member1 = new Member("Alice Smith", "M001");
        Member member2 = new Member("Bob Johnson", "M002");
        library.registerMember(member1);
        library.registerMember(member2);
        library.lendBook("978-0134685991", "M001");
        library.lendBook("978-0132350884", "M002");
        System.out.println(member1.name + " borrowed: ");
        for (Book book : member1.getBorrowedBooks()) {
            System.out.println(book.title);
        }
        System.out.println(member2.name + " borrowed: ");
        for (Book book : member2.getBorrowedBooks()) {
            System.out.println(book.title);
        }
    }
}
