package com.learn.DesignPatterns.Behavioural.Facade;
/*
* Imagine you're using a computer. You don't need to know how the internal components like the CPU, hard drive, or memory work in order to use it.
* You just need to know how to interact with the user interface.
* The complex internals are hidden behind a simple interface. This is essentially what the Facade pattern does
*
* In programming, a facade is a class that provides a simple interface to a complex subsystem.
* This subsystem might consist of several classes.
* The facade simplifies the interface, making it easier for the client code to use..
* */

class CPU {
    public void execute(){
        System.out.println("CPU is executing...");
    }
}

class Memory{
    public void loading(){
        System.out.println("Loading from memory...");
    }
}

class HardDrive {
    public void read(){
        System.out.println("Reading from hard drive...");
    }
}

class Computer {
    // This is the Facade  --> Provides the client a simple interface to interact with complex sub systems
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void turnON(){
        System.out.println("Turning on the computer...");
        this.cpu.execute();
        this.memory.loading();
        this.hardDrive.read();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.turnON();
    }
}
