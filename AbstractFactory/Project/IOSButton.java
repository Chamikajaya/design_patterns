package com.learn.DesignPatterns.Behavioural.AbstractFactory.Project;

public class IOSButton implements Button{
    @Override
    public void onHover() {
        System.out.println("Hovering on IOS button...");
    }

    @Override
    public void onClick() {
        System.out.println("Opening Safari browser...");
    }
}
