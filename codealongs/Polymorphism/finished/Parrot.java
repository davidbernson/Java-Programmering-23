package codealongs.Polymorphism.finished;

public class Parrot extends Animal implements Talking {
    
    
    public Parrot(int age, double weight, double length, String name) {
        super(age, weight, length);
        this.name = name;
    }

    public void fly(double time) {
        System.out.println(name + " flaps its wings and flies for " + time + " seconds.");
    }

    public void talk(String message) {
        System.out.println(name + " says: " + message);
    }
}
