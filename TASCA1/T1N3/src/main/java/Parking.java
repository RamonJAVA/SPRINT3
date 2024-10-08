import Commands.AccelerateCommand;
import Commands.BrakeCommand;
import Commands.Sender;
import Commands.StartCommand;
import Vehicles.Bike;
import Vehicles.Boat;
import Vehicles.Car;
import Vehicles.Plane;

public class Parking {
    public static void start(){
        Sender sender = new Sender();

        Bike bike = new Bike("Harley");
        Boat boat = new Boat("Transatlantic");
        Car car = new Car("Mercedes");
        Plane plane = new Plane("Airbus");

        StartCommand startBike = new StartCommand(bike);
        StartCommand startBoat = new StartCommand(boat);
        StartCommand startCar = new StartCommand(car);
        StartCommand startPlane = new StartCommand(plane);

        AccelerateCommand accelerateBike = new AccelerateCommand(bike);
        AccelerateCommand accelerateBoat = new AccelerateCommand(boat);
        AccelerateCommand accelerateCar = new AccelerateCommand(car);

        BrakeCommand brakeBike = new BrakeCommand(bike);
        BrakeCommand brakeBoat = new BrakeCommand(boat);

        sender.addCommand(startBike);
        sender.addCommand(startCar);
        sender.addCommand(accelerateBike);
        sender.addCommand(accelerateCar);
        sender.addCommand(brakeBike);
        sender.addCommand(brakeBoat);

        sender.executeCommands();
    }
}
