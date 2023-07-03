package com.learn.DesignPatterns.Behavioural.Factory.VehicleFactory;

public class MotorCycle extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Motorcycle is staring...");

    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is speeding up...");

    }

    @Override
    public void hitBreaks() {
        System.out.println("Motorcycle is slowing down...");

    }
}
