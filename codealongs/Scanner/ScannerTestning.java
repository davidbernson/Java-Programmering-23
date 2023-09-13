package codealongs.Scanner;

import java.util.Scanner;

public class ScannerTestning {
    public static void main(String[] args) {
    System.out.println("Guess an integer");
    Scanner scanner = new Scanner(System.in);
    int num;
    num = scanner.nextInt();

    scanner.nextLine();

    
        
    
        
        
    

    if (num != 6 && num >0 && num <10){
        System.out.println("Wrong, try again");
        scanner.close();
    }
    else if(num == 6){
      System.out.println("Write something");
      String newString = scanner.nextLine();

      if (newString.equals("hello world")) {
        System.out.println("Goodbye World");
      }
      else {
      int wordLenght = newString.length();
      System.out.println(wordLenght + " characters written");
      scanner.close();

      }


      
    }

    else if (num  <= 0) {
        System.out.println("No negative numbers, try again");
        scanner.close();
    }

    else if (num >10) {
        System.out.println("Too high of a number, try again");
        scanner.close();
    }

   




   }

    }


    

