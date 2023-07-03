package com.learn.DesignPatterns.Behavioural.Composite;

public class Product implements Component{
    private String name;
    private int price;

    public Product(String name, int price) {
        this.price = price;
        this.name = name;
    }
    @Override
    public void displayProduct() {
        System.out.println(this.name + "--> " + this.price);

    }
    @Override
    public int getTotalPrice() {
        return this.price;
    }
}
