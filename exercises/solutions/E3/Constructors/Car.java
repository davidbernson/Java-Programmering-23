package exercises.solutions.E3.constructors;

class Car {
    private String make;
    private String model;
    private int year;
    private String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car(String make, String model, int year) {
        this(make, model, year, "Unknown");
    }

    public Car(String make) {
        this(make, "Unknown", 0, "Unkown");
    }

    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022, "Blue");
        car1.printDetails();

        Car car2 = new Car("Honda", "Accord", 2023);
        car2.printDetails();

        Car car3 = new Car("Ford");
        car3.printDetails();
    }
}
