package com.learn.DesignPatterns.Behavioural.Command;

public class CloseGarageDoor implements Command{
    // A Concrete Command class

    private GarageDoor garageDoor;

    public CloseGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.closeDoor();
    }
}
