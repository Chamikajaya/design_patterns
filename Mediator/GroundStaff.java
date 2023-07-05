package com.learn.DesignPatterns.Behavioural.Mediator;

public class GroundStaff extends Colleague{
    public GroundStaff(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Ground Staff received the message --> " + message);
    }
}
