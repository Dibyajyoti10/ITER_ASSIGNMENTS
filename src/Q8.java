interface Vehicle {
    void accelerate();

    void brake();
}

// Car class implementing the Vehicle interface
class Car2 implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car is applying brakes");
    }

    // Method overloading for accelerate() in Car class
    public void accelerate(int speed) {
        System.out.println("Car is accelerating at " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at " + speed + " km/h for " + duration + " seconds");
    }
}

// Bicycle class implementing the Vehicle interface
class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is applying brakes");
    }

    // Method overloading for accelerate() in Bicycle class
    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating at " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating at " + speed + " km/h for " + duration + " seconds");
    }
}

// Main class
public class Q8{
    public static void main(String[] args) {
        // Instantiate Car and Bicycle objects
        Car2 car = new Car2();
        Bicycle bicycle = new Bicycle();

        // Test overridden methods
        System.out.println("Car:");
        car.accelerate();
        car.brake();
        car.accelerate(60);
        car.accelerate(80, 10);

        System.out.println("\nBicycle:");
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate(20);
        bicycle.accelerate(30, 5);
    }
}