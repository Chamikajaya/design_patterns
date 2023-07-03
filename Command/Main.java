package com.learn.DesignPatterns.Behavioural.Command;

public class Main {
    public static void main(String[] args) {
       RemoteControl remoteControl = new RemoteControl();
       Light light = new Light();
       TurnOnLights turnOnLights = new TurnOnLights(light);
       TurnOffLights turnOffLights = new TurnOffLights(light);
       remoteControl.setCommand(turnOnLights);
       remoteControl.pressButton();
       remoteControl.setCommand(turnOffLights);
       remoteControl.pressButton();

       GarageDoor garageDoor = new GarageDoor();
       OpenGarageDoor openGarageDoor = new OpenGarageDoor(garageDoor);
       CloseGarageDoor closeGarageDoor = new CloseGarageDoor(garageDoor);
       remoteControl.setCommand(openGarageDoor);
       remoteControl.pressButton();
       remoteControl.setCommand(closeGarageDoor);
       remoteControl.pressButton();


    }

}
