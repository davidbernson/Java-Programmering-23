package codealongs.BMICalculator.finished;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(s.locale());
        
        double weightInput;
        double heightInput;

        System.out.print("Enter your weight in kilograms: ");
        weightInput = s.nextDouble();

        System.out.print("Enter your height in meters: ");
        heightInput = s.nextDouble();

        Person p = new Person(heightInput, weightInput);
        double BMI = p.weight_kg / (p.height_m * p.height_m);

        System.out.println("Your body mass index is: " + BMI);

        s.close();
    }
}
