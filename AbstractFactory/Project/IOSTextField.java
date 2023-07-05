package com.learn.DesignPatterns.Behavioural.AbstractFactory.Project;

public class IOSTextField implements TextField{
    @Override
    public void highlight() {
        System.out.println("Highlighting some text on IOS...");
    }

    @Override
    public void shareText() {
        System.out.println("Sharing the text to nearby IOS devices...");
    }
}
