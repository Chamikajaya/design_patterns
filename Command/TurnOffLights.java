package com.learn.DesignPatterns.Behavioural.Command;

public class TurnOffLights implements Command{
    // A Concrete Command class

    private Light light;

    public TurnOffLights(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
