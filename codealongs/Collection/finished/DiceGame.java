package codealongs.Collection.finished;
import java.util.*;

public class DiceGame {


    public static void main(String[] args) {
        rollDice(10, 1000);
    }

    static void rollDice(int numDice, int sides) {
        List<Die> dice = new ArrayList<Die>();

        while (dice.size() < numDice) dice.add(new Die(sides));
        
        dice.forEach((die) -> die.roll());        
        dice.forEach((die) -> System.out.println("Roll: " + die.getValue()));
    }
}
