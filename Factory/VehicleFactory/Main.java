package com.learn.DesignPatterns.Behavioural.Factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory myFactory = new CarFactory();
        Vehicle myCar =  myFactory.createVehicle();
        myCar.startEngine();
        myCar.accelerate();
        myCar.hitBreaks();
        System.out.println();
        VehicleFactory myFactory2 = new TruckFactory();
        Vehicle myTruck = myFactory2.createVehicle();
        myTruck.startEngine();
        myTruck.accelerate();
        myTruck.hitBreaks();



    }
}
