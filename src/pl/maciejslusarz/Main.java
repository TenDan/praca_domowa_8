package pl.maciejslusarz;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle vehicle1 = new Vehicle(110, 5, "Tomasz", "Drań");
        Vehicle vehicle2 = new Vehicle(240, 2, "Robert", "Kubica");
        Vehicle vehicle3 = new Vehicle(70, 5, "Bolesław", "Ździsiek");
        Vehicle vehicle4 = new Vehicle(410, 2);

        vehicle1.getIn();
        vehicle2.getIn();
        vehicle3.getIn();

        for (int i = 0; i < 15; i++)
            vehicle1.accelerate(); // 75
        for (int i = 0; i < 5; i++)
            vehicle1.slowDown(); // 60

        System.out.println(vehicle1.toString());

        for (int i = 0; i < 48; i++)
            vehicle2.accelerate();

        vehicle2.getIn();
        //vehicle2.getIn(); // Nie można

        System.out.println(vehicle2.toString());

        for (int i = 0; i < 5; i++)
            vehicle3.accelerate();

        for (int i = 0; i < 5; i++)
            vehicle3.slowDown();

        vehicle3.getOut();
        //vehicle3.getOut(); // Nie można

        vehicle3.changeOwner("Bogdan", "Leszko");

        System.out.println(vehicle3.toString());

        vehicle4.accelerate();

        System.out.println(vehicle4.toString());
    }
}
