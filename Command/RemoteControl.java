package com.learn.DesignPatterns.Behavioural.Command;

public class RemoteControl {
    // Invoker class --> Invoker class does not need to know about the implementation of the receivers
    // It just needs to know about the interface of the command
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
