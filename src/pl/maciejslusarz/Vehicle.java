package pl.maciejslusarz;

public class Vehicle {
    private int currentSpeed = 0;
    private int maxSpeed;
    private int passengerQuantity = 0;
    private int maxPassengerQuantity;
    private String ownerFirstName = "Salon";
    private String ownerLastName = "Samochodowy";

    Vehicle(int maxSpeed, int maxPassengerQuantity) {
        this.maxSpeed = maxSpeed;
        this.maxPassengerQuantity = maxPassengerQuantity;
    }

    Vehicle(int maxSpeed, int maxPassengerQuantity, String ownerFirstName, String ownerLastName) {
        this.maxSpeed = maxSpeed;
        this.maxPassengerQuantity = maxPassengerQuantity;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
    }

    public void accelerate() {
        if (this.passengerQuantity > 0) {
            if (this.currentSpeed < this.maxSpeed)
                this.currentSpeed += 5;
            if (this.currentSpeed > this.maxSpeed)
                this.currentSpeed = this.maxSpeed;
        } else {
            System.out.println("Samochód sam nie pojedzie");
        }
    }
    public void slowDown() {
        if (this.passengerQuantity > 0) {
            if (this.currentSpeed > 0)
                this.currentSpeed -= 3;
            if (this.currentSpeed < 0)
                this.currentSpeed = 0;
        } else {
            System.out.println("Samochód sam nie zahamuje");
        }
    }
    public void getIn() {
        if (this.passengerQuantity < maxPassengerQuantity)
            this.passengerQuantity++;
        else
            System.out.println("W tym pojeździe nie zmieści się więcej pasażerów!");
    }
    public void getOut() {
        if (this.passengerQuantity > 0)
            this.passengerQuantity--;
        else
            System.out.println("Nie miał kto wysiąść!");
    }
    public void changeOwner(String ownerFirstName, String ownerLastName) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "currentSpeed=" + currentSpeed +
                ", maxSpeed=" + maxSpeed +
                ", passengerQuantity=" + passengerQuantity +
                ", maxPassengerQuantity=" + maxPassengerQuantity +
                ", ownerFirstName=" + ownerFirstName +
                ", ownerLastName=" + ownerLastName +
                '}';
    }
}
