package com.learn.DesignPatterns.Behavioural.Factory.ShapeDesign;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape(double radius, double width, double height) {
        System.out.println("Creating Circle...");
        Circle circle= new Circle();
        circle.setRadius(radius);
        return circle;
    }
}
