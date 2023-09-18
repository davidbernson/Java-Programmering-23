package codealongs.Scanner.finished;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber;
        System.out.println("Please input a number: ");
        myNumber = scanner.nextInt();

        System.out.println("Input the average salary: ");
        double avgSalary = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Please enter a message:");
        String message = scanner.nextLine();

        System.out.println("Input number: " + myNumber);
        System.out.println("The average salary is " + avgSalary);
        System.out.println("The message is: " + message);

        scanner.close();
    }
}
