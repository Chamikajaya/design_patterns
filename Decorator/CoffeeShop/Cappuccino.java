package com.learn.DesignPatterns.Behavioural.Decorator.CoffeeShop;

public class Cappuccino implements Coffee{
    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public double getCost() {
        return 1.49;
    }
}
