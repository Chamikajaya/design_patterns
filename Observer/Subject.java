package com.learn.DesignPatterns.Behavioural.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterUser(Observer observer);
    void notifyObservers();
}
