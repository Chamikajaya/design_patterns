package com.learn.DesignPatterns.Behavioural.Command;

public class OpenGarageDoor implements Command{
    // A Concrete Command class
    private GarageDoor garageDoor;

    public OpenGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.openDoor();
    }
}
