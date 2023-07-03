package com.learn.DesignPatterns.Behavioural.Factory.VehicleFactory;

public class MotorCycleFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new MotorCycle();
    }
}
