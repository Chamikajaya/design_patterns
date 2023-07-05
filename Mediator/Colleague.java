package com.learn.DesignPatterns.Behavioural.Mediator;

public abstract class Colleague {
    // The colleague class has a reference to Mediator object.
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.sendMessage(message, this);  // Here this refers to the object (colleague) who sent the message (The sender)
    }


    public abstract void receiveMessage(String message);
}
