public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();

        airport.boeing.maxPassengerCount = 345;
        airport.boeing.noseToTailLength_meters = 73.9;
        airport.boeing.model = "Boeing 777-200";

        System.out.println("Welcome to " + airport.name);
        System.out.println("The following planes are in the airport:");

        System.out.println(airport.embraer.model);
        System.out.println(airport.boeing.model);

        Airplane airbus = new Airplane();
        airbus.maxPassengerCount = 544;
        airbus.noseToTailLength_meters = 72.7;
        airbus.model = "Airbus A380";

        Airplane anotherBoeing = airport.boeing;

        System.out.println("There's also two planes outside of the airport:");

        System.out.println(airbus.model);
        System.out.println(anotherBoeing.model);

        airport.boeing.model = "Boeing 777-300";

        System.out.println(airport.boeing.model);
        System.out.println(anotherBoeing.model);

    }
}
