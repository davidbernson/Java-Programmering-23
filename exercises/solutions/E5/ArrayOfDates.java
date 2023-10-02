package exercises.solutions.E5;

import java.util.Date;
import java.util.Arrays;

public class ArrayOfDates {

    public static void main(String[] args) {
        Date[] myDateArray = new Date[3];

        myDateArray[0] = new Date(466985221162L);
        myDateArray[1] = new Date(306244347347L);
        myDateArray[2] = new Date(205723744312L);

        for (Date d : myDateArray) {
            System.out.println(d.toString());
        }

        Arrays.sort(myDateArray);

        for (Date d : myDateArray) {
            System.out.println(d.toString());
        }

        long diff = myDateArray[2].getTime() - myDateArray[0].getTime();

        System.out.println("The difference between the longes and shortest date is: " + diff);
        
        long diffDays = diff/1000/60/60/24;
        
        System.out.println("Which translates to " + diffDays + " days!");


    }
}
