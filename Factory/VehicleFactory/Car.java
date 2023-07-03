package com.learn.DesignPatterns.Behavioural.Factory.VehicleFactory;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car is staring...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is speeding up...");
    }

    @Override
    public void hitBreaks() {
        System.out.println("Car is slowing down...");
    }
}
