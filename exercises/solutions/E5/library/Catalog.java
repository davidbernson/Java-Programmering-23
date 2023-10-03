package exercises.solutions.E5.library;

public class Catalog {
    Book[] catalog;

    public Catalog(int bookCount) {
        catalog = new Book[bookCount];
    }

    public void addBook(int index, Book b) {
        catalog[index] = b;
    }

    public void printAll() {
        for (Book b : catalog) {
            System.out.println(b.toString());
        }
    }

    public void searchByTitle(String prompt) {
        for (Book b : catalog) {
            if (b.getTitle() == prompt) {
                System.out.println("Found a match: " + b.getTitle() + " by " + b.getAuthorLastName() +", " + b.getAuthorFirstName() + ".");
                System.out.println("Check in shelf " + b.getShelfID() + "!");
                return;
            }
        }
        
        System.out.println("No matching title found in catalog");
    }
}
