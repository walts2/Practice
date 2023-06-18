
public class Book {
	private String title;
    private String author;
    private int yearPublished;
    private int numCopies;

    public Book(String title, String author, int yearPublished, int numCopies) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numCopies = numCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void borrow() {
        if (numCopies > 0) {
            numCopies--;
        }
    }

    public void returnCopy() {
        numCopies++;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + yearPublished + "), " + numCopies + " copies available";
    }
}



