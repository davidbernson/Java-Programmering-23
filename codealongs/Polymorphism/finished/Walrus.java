package codealongs.Polymorphism.finished;

public class Walrus extends Animal {

    public void printWeight() {
        System.out.println("Weight: " + weight);
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }

    public void printLength() {
        System.out.println("Length: " + getLength());
    }

    public Walrus(int age, double weight, double length) {
        super(age, weight, length);
    }
}