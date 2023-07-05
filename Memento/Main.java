package com.learn.DesignPatterns.Behavioural.Memento;

import java.util.ArrayList;
import java.util.List;


    // Memento class contains the state of the Originator
     class Memento {
        private String state;

        // The constructor will be used by the Originator to save its state
        public Memento(String state){
            this.state = state;
        }

        // Used by the Originator to restore its state
        public String getState(){
            return state;
        }
    }

    // Originator class creates a Memento containing a snapshot of its current internal state.
    // Uses the Memento to restore its internal state
     class Originator {
        private String state;

        // Set the state of the Originator
        public void setState(String state){
            this.state = state;
        }

        // Get the state of the Originator
        public String getState(){
            return state;
        }

        // Save the current state of the Originator inside a Memento
        public Memento saveStateToMemento(){
            return new Memento(state);
        }

        // Restore the state of the Originator from a Memento
        public void getStateFromMemento(Memento memento){
            state = memento.getState();
        }
    }

    // Caretaker class is responsible to restore object state from Memento.
     class CareTaker {
        private List<Memento> mementoList = new ArrayList<Memento>();

        // Add a new Memento to the list
        public void add(Memento state){
            mementoList.add(state);
        }

        // Get a Memento from the list
        public Memento get(int index){
            return mementoList.get(index);
        }
    }

    class Main{
        public static void main(String[] args) {
                Originator originator = new Originator();
                CareTaker careTaker = new CareTaker();

                // Change state and save it to Memento through CareTaker
                originator.setState("State #1");
                originator.setState("State #2");
                careTaker.add(originator.saveStateToMemento());

                // Change state and save it to Memento through CareTaker
                originator.setState("State #3");
                careTaker.add(originator.saveStateToMemento());

                // Change state
                originator.setState("State #4");

                System.out.println("Current State: " + originator.getState());

                // Restore state from Memento through CareTaker
                originator.getStateFromMemento(careTaker.get(0));
                System.out.println("First saved State: " + originator.getState());

                // Restore state from Memento through CareTaker
                originator.getStateFromMemento(careTaker.get(1));
                System.out.println("Second saved State: " + originator.getState());
        }
    }


