package exercises.solutions.E4;

import java.util.Scanner;

public class MyStringMethods {
    
    public static String stringReverser(String string) {
        String reverseString = "";

        for (int i = string.length()-1; i >= 0 ; i--) {
            reverseString += string.charAt(i);
        }

        return reverseString;
    }

    public static int charCounter(String string, char pattern) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == pattern) count++;
        }

        return count;
    }

    public static boolean emailValidator(String address) {

        if (address.contains("@") != true || address.contains(".") != true) {
            System.out.println("Invalid address, does not contain @ or .");
            return false;
        }

        String charBeforeAt = "";
        for (int i = 0; address.charAt(i) != '@'; i++) charBeforeAt += address.charAt(i);


        String charAfterAt = "";
        for (int i = address.length()-1; address.charAt(i) != '@'; i--) {
            charAfterAt += address.charAt(i);
        }

        if (charBeforeAt.length() <= 0 || charAfterAt.length() <= 0) {
            System.out.println("Invalid address, missing fields");
            return false;
        }

        String domain = "";

        for (int i = address.length()-1; address.charAt(i) != '.'; i--) {
            domain += address.charAt(i);
        }
        
        domain = stringReverser(domain);

        if (domain.equals("com") || domain.equals("se")) return true;

        else return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert a string: ");
        String revInput = scanner.nextLine();
        System.out.println("Reversed string: " + stringReverser(revInput));

        System.out.print("Insert a string: ");
        String counterInput = scanner.nextLine();
        System.out.print("Insert a pattern character: ");
        char patternInput = scanner.nextLine().charAt(0);
        System.out.println("The count of the character " + patternInput + " is: " + charCounter(counterInput, patternInput));

        System.out.println("Insert an e-mail address: ");
        String inputAddress = scanner.nextLine();
        System.out.println("E-mail is valid: " + emailValidator(inputAddress));
            
        scanner.close();
    }
}
