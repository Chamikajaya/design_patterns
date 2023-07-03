package com.learn.DesignPatterns.Behavioural.Factory.VehicleFactory;

public class TruckFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
