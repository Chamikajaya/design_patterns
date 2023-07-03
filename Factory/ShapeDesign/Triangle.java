package com.learn.DesignPatterns.Behavioural.Factory.ShapeDesign;

public class Triangle implements Shape{
    private double base;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;
    @Override
    public void findArea() {
        System.out.println("The area is " + 0.5 * height * base);

    }

    @Override
    public void findPerimeter() {
        System.out.println("I am too lazy to find the perimeter of a triangle");
    }

    @Override
    public void displayShape() {
        System.out.println("Here is your triangle with base and height ->  " + this.base + ", " + this.height);

    }
}
