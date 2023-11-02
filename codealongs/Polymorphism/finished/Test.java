package codealongs.Polymorphism.finished;

public class Test {
    public static void main(String[] args) {
        Walrus w = new Walrus(14, 261.3, 124.1);
        //  Animal a = new Animal(14, 261.3, 124.1);

        w.printAge();
        w.printLength();
        w.printWeight();

        System.out.println(w instanceof Walrus);
        System.out.println(w instanceof Animal);

        //  walrusChecker(a);
        walrusChecker(w);

        Parrot p = new Parrot(8, 0.314, 23.7,"Paulie");
        p.fly(18.6);
        p.talk("Paulie wants a cracker!");

        Robot r = new Robot();
        r.talk("Hello!");
        r.talk("The weather surely is lovely today!");

        walrusChecker(p);
        System.out.println("This object is a: " + r.getClass().getSimpleName() + " object.");

        introduce(p);
        introduce(r);
    }

    public static void walrusChecker(Animal a) {
        if (a instanceof Walrus != true) {System.out.println("This animal is not a Walrus!");}
        else {System.out.println("Seems like this is indeed a Walrus!");}
    }

    public static void introduce(Talking t) {
        t.talk("Hello!");
    }
}
