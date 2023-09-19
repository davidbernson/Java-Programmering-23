public class Triangle {
    int base;
    int height;

    void shadowingAndThis(int base) {
        System.out.println("This is the base method parameter: " + base);
        System.out.println("This is the base class variable: " + this.base);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.base = 5;

        triangle.shadowingAndThis(8);
    }
}



