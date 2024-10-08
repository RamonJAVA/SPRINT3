package Vehicles;

public class Boat extends Vehicle{
    public Boat(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The boat " + this.name + " is starting up it's motors.");
    }

    @Override
    public void accelerate() {
        System.out.println("The boat " + this.name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The boat " + this.name + " is braking.");
    }
}
