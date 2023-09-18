package exercises.solutions.E4;

import java.util.Scanner;
import exercises.solutions.E4.shapes.*;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Circle circle = new Circle();
        System.out.print("Enter circle radius: ");
        circle.setRadius(scanner.nextDouble());
        System.out.println("The area of a circle of radius " + circle.getRadius() + " is: " + String.format("%.2f", circle.computeArea()));
        System.out.println("The circumference of a circle of radius " + circle.getRadius() + " is: " + String.format("%.2f", circle.computeCircumference()));

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter rectangle height: ");
        rectangle.setA(scanner.nextDouble());
        System.out.print("Enter rectangle width: ");
        rectangle.setB(scanner.nextDouble());

        System.out.println("The area of a rectangle with height " + rectangle.getA() + " and width " + rectangle.getB() + " is: " + String.format("%.2f", rectangle.computeArea()));
        System.out.println("The perimeter of a rectangle with height " + rectangle.getA() + " and width " + rectangle.getB() + " is: " + String.format("%.2f", rectangle.computePerimeter()));

        scanner.close();
    }
}
