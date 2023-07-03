package com.learn.DesignPatterns.Behavioural.Factory.VehicleFactory;

public class Truck extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Truck is staring...");

    }

    @Override
    public void accelerate() {
        System.out.println("Truck is speeding up...");

    }

    @Override
    public void hitBreaks() {
        System.out.println("Truck is slowing down...");

    }
}
