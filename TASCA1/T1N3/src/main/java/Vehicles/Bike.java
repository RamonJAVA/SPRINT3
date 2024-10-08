package Vehicles;

public class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The bike " + this.name + " is starting up it's motor.");
    }

    @Override
    public void accelerate() {
        System.out.println("The bike " + this.name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The bike " + this.name + " is braking.");
    }

}
