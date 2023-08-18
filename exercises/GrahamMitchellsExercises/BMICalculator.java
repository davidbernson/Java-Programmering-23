package exercises.GrahamMitchellsExercises;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        double weight_kg;
        double length_m;
        double BMI;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your weight in kilograms? ");
        weight_kg = keyboard.nextDouble();

        System.out.print("What is your length in meters? ");
        length_m = keyboard.nextDouble();

        BMI = (weight_kg) / (length_m*length_m);

       
        String BMIClass = null;

        if (BMI < 18.5) {
            BMIClass = "underweight";
        } else if (BMI < 25) {
            BMIClass = "normal";
        } else if (BMI < 30) {
            BMIClass = "overweight";
        } else if (BMI >= 30) {
            BMIClass = "obese";
        }

        System.out.println("Your Body Mass Index is " + BMI + ": " + BMIClass);

        keyboard.close();
    }
}
