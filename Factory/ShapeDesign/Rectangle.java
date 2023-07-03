package com.learn.DesignPatterns.Behavioural.Factory.ShapeDesign;

public class Rectangle implements Shape{
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void findArea() {
        System.out.println("The area is " +  (height * width));

    }

    @Override
    public void findPerimeter() {
        System.out.println("The perimeter is " + (2 *  (height + width)));

    }

    @Override
    public void displayShape() {
        System.out.println("Here is your rectangle with width and height ->  " + this.width + ", " + this.height);

    }
}
