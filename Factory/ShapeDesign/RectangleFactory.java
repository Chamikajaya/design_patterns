package com.learn.DesignPatterns.Behavioural.Factory.ShapeDesign;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createShape(double radius, double width, double height) {
        System.out.println("Creating Rectangle...");
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        return rectangle;
    }
}
