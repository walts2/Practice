import java.util.ArrayList;
public class List {
	private ArrayList<Book> books;

    public List() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int index) {
        books.remove(index);
    }

    public void borrowBook(int index) {
        books.get(index).borrow();
        if (books.get(index).getNumCopies() == 0) {
            removeBook(index);
        }
    }

    public void returnBook(int index) {
        books.get(index).returnCopy();
    }

    public void printAvailableBooks() {
        System.out.println("\n" + "ELECTRONIC BOOK RENTAL SYSTEM:");
        System.out.println("*****************************:");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getNumCopies() > 0) {
                System.out.println(i + 1 + ". " + books.get(i));
            }
        }
    }
    
    public int getNumBooks() {
        return books.size();
    }
    
    public Book getBook(int index) {
        if (index < 0 || index >= books.size()) {
            return null;
        }
        return books.get(index);
    }
}