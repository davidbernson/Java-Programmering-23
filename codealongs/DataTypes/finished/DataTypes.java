package codealongs.DataTypes.finished;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = s.nextInt();

        System.out.print("Enter your height in centimeters: ");
        double height = s.nextDouble();

        System.out.print("Enter your name: ");
        String name = s.next();

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old and " + height/100 + " m tall.");
        
        boolean isAdult = age >= 18;
        boolean isTall = height > 185;
        boolean isTeenager = (age >= 13) && (age <= 19);
        boolean hasDiscount = (age >= 65) || (isTeenager);

        System.out.println(name + " is an adult: " + isAdult);
        System.out.println(name + " is a tall person: " + isTall);
        System.out.println(name + " is a teenager: " + isTeenager);
        System.out.println(name + " is entitled to a discount: " + hasDiscount);

        s.close();
    }
}
