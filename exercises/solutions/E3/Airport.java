package exercises.solutions.E3;

class Airport {
    int maxPlanes = 10;
    String name = "Bergtuna Flygfält";

    

    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane();

        Airplane plane3 = plane1;

        System.out.println(plane1);
        System.out.println(plane2);
        System.out.println(plane3);

        plane1.model = "Boeing 777";
        plane1.maxPassengerCount = 265;
        plane1.noseToTailLength_meters = 82.3;

        System.out.println(plane1.model);
        System.out.println(plane2.model);
        System.out.println(plane3.model);
    }
}
