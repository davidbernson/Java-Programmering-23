package exercises.solutions.E4;

import java.util.Scanner;

public class MyMathMethods {
    public static int calculateFactorial(int number) {
        int factorial = 1;

        if (number < 0) {
            System.out.println("Error: factorial is undefined for negative integers");
            return 0;
        }

        if (number == 0) {
            factorial = 1;
            return factorial;
        }

        for (int i = 1;i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static int calculateFibonacci(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Position must be a positive integer.");
        }

        if (number == 1 || number == 2) {
            return number - 1;
        }

        int previous = 0;
        int current = 1;
        int fibonacci = 0;

        for (int i = 3; i <= number; i++) {
            fibonacci = previous + current;
            previous = current;
            current = fibonacci;
        }

        return fibonacci;
    }

    public static boolean primeChecker(int number) {
        boolean isPrime = true;

        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number-1; i++ )
            if (number % i == 0) {
                isPrime = false;
            }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Factorial: Enter a positive integer: ");
        int factInput = scanner.nextInt();
        int factResult = calculateFactorial(factInput);
        System.out.println("The factorial of " + factInput + " is: " + factResult);

        System.out.print("Fibonacci: Enter a positive integer: ");
        int fiboInput = scanner.nextInt();
        int fiboResult = calculateFibonacci(fiboInput);
        System.out.println("The fibonacci number at position " + fiboInput + " is: " + fiboResult);

        System.out.print("Prime Checker: Enter a positive integer: ");
        int primeInput = scanner.nextInt();
        boolean primeResult = primeChecker(primeInput);
        if (primeResult == true) {
            System.out.println(primeInput + " is a prime number!");
        } else {
            System.out.println(primeInput + " is not a prime number!");
        }
        
        scanner.close();
    }
}
