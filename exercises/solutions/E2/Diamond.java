package exercises.solutions.E2;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please input the number of total rows: ");
        int input = s.nextInt();


        if (input % 2 != 0) {

            // Print top half of diamond
            for (int stars = 1; stars <= input; stars += 2) {
                int spaces = (input - stars) / 2;
                
                // Print spaces before stars
                for (int i = 0; i < spaces; i++) {
                    System.out.print(".");
                }

                // Print stars
                for (int i = 0; i < stars; i++) {
                    System.out.print("*");
                }

                // Print spaces after stars
                for (int i = 0; i < spaces; i++) {
                    System.out.print(".");
                }

                System.out.println();
            }
        
            // Print bottom half of diamond
            for (int stars = input - 2; stars > 0; stars -= 2) {
                int spaces = (input - stars) / 2;

                // Print spaces before stars
                for (int i = 0; i < spaces; i++) {
                    System.out.print(".");
                }

                // Print stars
                for (int i = 0; i < stars; i++) {
                    System.out.print("*");
                }

                // Print spaces after stars
                for (int i = 0; i < spaces; i++) {
                    System.out.print(".");
                }

                System.out.println();
            }

            s.close();
        } else {
            System.out.println("That's not an odd number!");
        }
    }
}
