package com.learn.DesignPatterns.Behavioural.AbstractFactory.Project;

public class IOSUIFactory extends UIComponentFactory{
    @Override
    public Button createButton() {
        System.out.println("IOS button created...");
        return new IOSButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("IOS text field created...");
        return new IOSTextField();
    }
}
