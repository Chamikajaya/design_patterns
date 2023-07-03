package com.learn.DesignPatterns.Behavioural.Decorator.CoffeeShop;

public class CaramelSyrupDecorator extends CoffeeDecorator{
    public CaramelSyrupDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Caramel Syrup";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.29;
    }
}
