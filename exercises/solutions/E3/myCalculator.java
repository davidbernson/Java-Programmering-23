package exercises.solutions.E3;

class myCalculator {
    public static void main(String[] args) {
        int a = 8, b = 23;
        double temperature = 28.3;
        int number = 49;
        
        double area = ( a * b ) / 2;
        System.out.println("The area of a triangle with height " + a + " and width " + b + " is " + area + ".");

        double tempFahrenheit = (temperature * 9/5) + 32;
        System.out.println(temperature + " degrees Celsius is " + tempFahrenheit + " degrees Fahrenheit.");

        String numberType;
        if (number % 2 == 0){numberType = "even";} else {numberType = "odd";}
        System.out.println(number + " is an " + numberType + " number.");

    }
}