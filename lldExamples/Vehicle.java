

// Example of Liskov Substitution Principle.
public class Vehicle {
    public int getNumberOfWheels() {
        return 2;
    }
}

class EngineVehicle extends Vehicle {
    public boolean hasEngine() {
        return true;
    }
}

class Bicycle extends Vehicle {
}

class MotorCycle extends EngineVehicle {
}

class Car extends EngineVehicle {
    public int getNumberOfWheels() {
        return 4;
    }
}
