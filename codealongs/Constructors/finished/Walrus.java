package codealongs.Constructors.finished;

public class Walrus {
    public int age;
    public String name;
    private double weight;

    private static int DEFAULT_AGE = 15;
    private static String DEFAULT_NAME = "Stefan";
    private static double DEFAULT_WEIGHT = 1500;
    
    public Walrus () {
        age = DEFAULT_AGE;
        name = DEFAULT_NAME;
        weight = DEFAULT_WEIGHT;
    }

    public Walrus (int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    
    public Walrus (int age, String name) {
        this(age, name, 100);
    }

    public Walrus (int age) {
        this(age, null, 100);
    }

    public static void main(String[] args) {
        Walrus abraham = new Walrus(15, "Abraham", 1900);
        Walrus thelonius = new Walrus(31, "Thelonius", 2600);
        Walrus stefan = new Walrus();

        System.out.println(abraham.name);
        System.out.println(thelonius.weight);
        System.out.println(stefan.name);

    }
}

