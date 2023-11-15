package codealongs.Exception.finished;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {scanner.nextInt();}
        catch (InputMismatchException e) {
            System.out.println("Whoops! Wrong input type!");
        }
        finally {scanner.close();}
    }
}
