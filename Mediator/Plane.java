package com.learn.DesignPatterns.Behavioural.Mediator;

public class Plane extends Colleague{
    public Plane(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Plane received the message --> " + message);
    }
}
