package com.learn.DesignPatterns.Behavioural.AbstractFactory.Project;

import java.awt.*;

public class AndroidUIFactory extends UIComponentFactory{
    public Button createButton(){
        System.out.println("Android Button created...");
        return new AndroidButton();
    }
    public TextField createTextField(){
        System.out.println("Android TextField created...");
        return new AndroidTextField();
    }

}
