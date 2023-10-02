package exercises.solutions.E5;

public class PlanetPrinter {
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.println(p.name());
        }
    }
}
