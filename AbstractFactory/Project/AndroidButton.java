package com.learn.DesignPatterns.Behavioural.AbstractFactory.Project;

public class AndroidButton implements Button{
    @Override
    public void onHover() {
        System.out.println("Hovering on android button...");
    }

    @Override
    public void onClick() {
        System.out.println("Opening Google Chrome...");
    }
}
