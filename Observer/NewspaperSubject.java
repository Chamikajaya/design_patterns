package com.learn.DesignPatterns.Behavioural.Observer;
import java.util.ArrayList;

public class NewspaperSubject implements Subject{
    private ArrayList<Observer> subscribers = new ArrayList(); // To keep track of all the observers
    private String latestVersion;

    public NewspaperSubject(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unregisterUser(Observer observer) {
        subscribers.remove(observer);
    }

    // Making a state change in the subject (Newspaper)
    public void publishNewEdition(String newVersion){
        this.latestVersion = newVersion; // Updating the latest version
        // This state change happened to the subject should be notified to all the subscriber objects
        notifyObservers();
    }

    @Override
    public void notifyObservers() {  // This will notify all the observers who has subscribed
        for (var subscriber : subscribers){
            subscriber.updateSubscriber(this.latestVersion);  // This will update the observers accordingly.
        }
    }
}
