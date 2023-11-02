package codealongs.Polymorphism.finished;
abstract class Animal {
    public int age;
    protected double weight;
    private double length;

    public String name;

    public Animal(int age, double weight, double length) {
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
