package codealongs.Inheritance;

public class Master {
    public static void main(String[] args) {
        Parrot p1 = new Parrot();
        Parrot p2 = new Parrot();
        Bird b1 = new Bird();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(b1);

        System.out.println(p1 instanceof Bird);
        System.out.println(p2 instanceof Bird);
        System.out.println(b1 instanceof Bird);

        System.out.println(p1 instanceof Parrot);
        System.out.println(p2 instanceof Parrot);
        System.out.println(b1 instanceof Parrot);

        p1.Fly();
    }
}
