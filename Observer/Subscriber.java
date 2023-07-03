package com.learn.DesignPatterns.Behavioural.Observer;

public class Subscriber implements Observer{
    private String subscriberName;

    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateSubscriber(String newEdition) {
        System.out.println(this.subscriberName + " got the details about " + newEdition);
    }
}
