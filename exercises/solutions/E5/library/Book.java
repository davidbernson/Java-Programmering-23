package exercises.solutions.E5.library;

public class Book {
    private String title;
    private String authorLastName;
    private String authorFirstName;
    private int publicationYear;
    private int pageCount;
    private boolean isNobelAuthor;
    private String shelfID;

    public Book(String title, String authorLastName, String authorFirstName, int publicationYear, int pageCount, boolean isNobelAuthor, String shelfID) {
        this.title = title;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.publicationYear = publicationYear;
        this.pageCount = pageCount;
        this.isNobelAuthor = isNobelAuthor;
        this.shelfID = shelfID;
    }

    public String getShelfID() {
        return shelfID;
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pageCount;
    }

    public boolean isNobelAuthor() {
        return isNobelAuthor;
    }

    @Override
    public String toString() {
        return title + " - " + authorLastName + " (" + publicationYear + ")";
    }
}
