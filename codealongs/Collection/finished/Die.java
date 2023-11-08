package codealongs.Collection.finished;
import java.util.Random;

public class Die {
    private int value;
    private Random randomgen;
    private int sides;


    public Die(int sides) {
        this.sides = sides;
        randomgen = new Random();
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        value = randomgen.nextInt(1, sides+1);
    }    
}
