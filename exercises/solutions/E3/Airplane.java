package exercises.solutions.E3;

class Airplane {
    int maxPassengerCount = 48;
    double noseToTailLength_meters = 28.5;
    String model = "Embraer ERJ 145";

    public static void main(String[] args) {
        Airplane myPlane = new Airplane();
        
        System.out.println("Model: " + myPlane.model);
        System.out.println("Length: " + myPlane.noseToTailLength_meters);
        System.out.println("Max no. passengers: " + myPlane.maxPassengerCount);
    }
}
