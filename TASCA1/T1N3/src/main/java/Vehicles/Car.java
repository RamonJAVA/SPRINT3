package Vehicles;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The car " + this.name + " is starting up it's motor.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car " + this.name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The car " + this.name + " is braking.");
    }

}
