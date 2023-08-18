package exercises.solutions.E3;

import java.util.Scanner;

class myCalculator3 {
    static double areaOfTriangle(double height, double width) {
        return ( height * width ) / 2;
    }

    static double celsiusToFahrenheit(double temperature) {
        return ( temperature * 9/5 ) + 32;
    }

    static boolean isEven(int number) {
        if (number%2 == 0) { return true; }
        else { return false; }
    }

    public static void main(String[] args) {
        double height, width;
        double temperature;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the height of your triangle: ");
        height = scanner.nextDouble();
        System.out.print("Please enter the width of your triangle: ");
        width = scanner.nextDouble();

       
        double area = areaOfTriangle(height, width);
        System.out.println("The area of a triangle with height " + height + " and width " + width + " is " + area + ".");


        System.out.print("Please enter the temperature in degrees Celsius: ");
        temperature = scanner.nextDouble();
        double tempFahrenheit = celsiusToFahrenheit(temperature);
        System.out.println(temperature + " degrees Celsius is " + tempFahrenheit + " degrees Fahrenheit.");

        
        System.out.print("Please enter an integer of your choice: ");
        number = scanner.nextInt();
        String numberType;
        if (isEven(number) == true){numberType = "even";} else {numberType = "odd";}
        System.out.println(number + " is an " + numberType + " number.");

        scanner.close();

    }
}