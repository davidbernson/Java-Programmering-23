package exercises.solutions.E3;

class myCalculator2 {
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
        int a = 8, b = 23;
        double temperature = 28.3;
        int number = 49;
        
        double area = areaOfTriangle(a, b);
        System.out.println("The area of a triangle with height " + a + " and width " + b + " is " + area + ".");

        double tempFahrenheit = celsiusToFahrenheit(temperature);
        System.out.println(temperature + " degrees Celsius is " + tempFahrenheit + " degrees Fahrenheit.");

        String numberType;
        if (isEven(number) == true){numberType = "even";} else {numberType = "odd";}
        System.out.println(number + " is an " + numberType + " number.");

    }
}