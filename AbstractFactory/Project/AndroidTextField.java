package com.learn.DesignPatterns.Behavioural.AbstractFactory.Project;

public class AndroidTextField implements TextField {
    @Override
    public void highlight() {
        System.out.println("Highlighting some text on Android...");
    }

    @Override
    public void shareText() {
        System.out.println("Sharing the text to nearby android devices...");
    }
}
