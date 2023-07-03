package com.learn.DesignPatterns.Behavioural.Command;

public class Light {
    // A receiver class
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}
