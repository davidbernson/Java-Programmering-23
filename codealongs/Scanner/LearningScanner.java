package codealongs.Scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
    System.out.println("Guess an integer");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    if (num != 6 && num >0 && num <10){
        System.out.println("Wrong, try again");
        scanner.close();
    }
    else if(num == 6){
      System.out.println("Write something");
      Scanner scanner2 = new Scanner(System.in);
      String newString = scanner2.nextLine();
            
      int wordLenght = newString.length();
      System.out.println(wordLenght + " characters written");
      scanner2.close();
      scanner.close();


      
    }

    else if (num  <0) {
        System.out.println("No negative numbers, try again");
        scanner.close();
    }

    else if (num >10) {
        System.out.println("Too high of a number, try again");
        scanner.close();
    }

   else {
    System.out.println("Wrong input");
    scanner.close();
   }

    }


    }
}
