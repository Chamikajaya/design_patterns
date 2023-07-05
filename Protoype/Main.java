package com.learn.DesignPatterns.Behavioural.Protoype;

// Abstract class Car which will be the prototype for creating new cars
abstract class Car{
    protected String model;
    protected String brand;
    protected int  horsePower;
    protected int  fuelCapacity;

    // Constructor to initialize the car object
    public Car(String model, String brand, int horsePower, int fuelCapacity) {
        this.model = model;
        this.brand = brand;
        this.horsePower = horsePower;
        this.fuelCapacity = fuelCapacity;
    }

    // Abstract clone method to be implemented by subclasses
    public abstract Car cloneCar();
}

// Sedan class that extends Car and implements the cloneCar method
class Sedan extends Car{
    private String sedanFeature;

    // Constructor to initialize the Sedan object
    public Sedan(String model, String brand, int horsePower, int fuelCapacity, String sedanFeature) {
        super(model, brand, horsePower, fuelCapacity);
        this.sedanFeature = sedanFeature;
    }

    // Implementing the cloneCar method for Sedan
    @Override
    public Car cloneCar() {
        // This will return the cloned car
        return new Sedan(model, brand, horsePower, fuelCapacity, sedanFeature ); // Since we set these variables as protected we could use them directly here.
    }
}

// SUV class that extends Car and implements the cloneCar method
class SUV extends  Car{
    private String suvFeature;

    // Constructor to initialize the SUV object
    public SUV(String model, String brand, int horsePower, int fuelCapacity, String suvFeature) {
        super(model, brand, horsePower, fuelCapacity);
        this.suvFeature = suvFeature;
    }

    // Implementing the cloneCar method for SUV
    @Override
    public Car cloneCar() {
        return new SUV(model, brand, horsePower, fuelCapacity, suvFeature);
    }
}

// Main class to test the Prototype pattern
public class Main {
    public static void main(String[] args) {
        // Creating a new Sedan object
        Sedan mySedan = new Sedan("i4", "BMW", 1500, 40, "electric - sedan");

        // Cloning the Sedan object using the Prototype pattern
        Car clonedSedan = mySedan.cloneCar();
    }
}
