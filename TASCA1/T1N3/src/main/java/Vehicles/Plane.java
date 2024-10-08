package Vehicles;

public class Plane extends Vehicle{

    public Plane(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The plane " + this.name + " is starting up it's motors.");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane " + this.name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The plane " + this.name + " is braking.");
    }

}
