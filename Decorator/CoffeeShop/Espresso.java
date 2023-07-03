package com.learn.DesignPatterns.Behavioural.Decorator.CoffeeShop;

public class Espresso implements Coffee{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}
