package com.learn.DesignPatterns.Behavioural.Observer;

public interface Observer {
    void updateSubscriber(String newEdition);  // To update the observers when there is a state change in the subject
}
