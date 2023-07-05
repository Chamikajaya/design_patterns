package com.learn.DesignPatterns.Behavioural.Mediator;

import java.util.ArrayList;

public class ControlTowerMediator implements Mediator {
    // Since all other colleagues except the sender should get the message we need to maintain an ArrayList
    private ArrayList<Colleague> colleagueArrayList = new ArrayList<>();

    public void sendMessage(String message, Colleague colleague) {
        for (var myColleague : colleagueArrayList){
            // Since sender should not get the message
            if (myColleague != colleague){
                myColleague.receiveMessage(message);
            }
        }
    }

    public void addColleague(Colleague colleague) {
        colleagueArrayList.add(colleague);
    }
}
