package com.learn.DesignPatterns.Behavioural.Command;

public class TurnOnLights implements Command{
    // A Concrete Command class
    private Light light;

    public TurnOnLights(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
