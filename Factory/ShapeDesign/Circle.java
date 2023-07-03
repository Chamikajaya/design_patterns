package com.learn.DesignPatterns.Behavioural.Factory.ShapeDesign;

public class Circle implements Shape{

    // TODO: As you can see Circle class does not handle the circle object creation instead it is taken care of by the circleFacory class which implements the factory method (Same goes for Triangle and Rectangle classes)
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void findArea() {
        System.out.println("The area is " + Math.PI * radius * radius);
    }

    @Override
    public void findPerimeter() {
        System.out.println("The circumference is " + Math.PI * radius * 2);

    }

    @Override
    public void displayShape() {
        System.out.println("Here is your circle with radius " + this.radius);
    }
}
