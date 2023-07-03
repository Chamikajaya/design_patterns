package com.learn.DesignPatterns.Behavioural.Composite;

import java.util.ArrayList;

public class GiftBox implements Component{
    private ArrayList<Component> components;
    private String boxname;

    public GiftBox(String boxname) {
        this.components = new ArrayList<>();
        this.boxname = boxname;
    }

    @Override
    public void displayProduct() {
        for (var component : components){
            component.displayProduct();
        }
    }
    @Override
    public int getTotalPrice() {
        int total = 0;
        for (var component : components){
            total += component.getTotalPrice();
        }
        return total;
    }

    public void addToBox(Component component){
        components.add(component);
    }

    public void removeFromBox(Component component){
        components.remove(component);
    }



}

