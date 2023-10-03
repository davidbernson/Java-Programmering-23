package exercises.solutions.E5;

import exercises.solutions.E5.library.*;

public class LibraryApp {
    public static void main(String[] args) {
        Book b1 = new Book("The Trial", "Kafka", "Franz", 1925, 152, false, "Hce.f01");
        Book b2 = new Book("The Books of Jacob", "Tokarczuk", "Olga", 2014, 912, true, "Hcemc.01");

        Catalog catalog = new Catalog(2);

        catalog.addBook(0, b1);
        catalog.addBook(1, b2);

        catalog.printAll();

        catalog.searchByTitle("The Books of Jacob");

    }

}
