package com.learn.DesignPatterns.Behavioural.Factory.ShapeDesign;

public class TriangleFactory implements ShapeFactory{
    @Override
    public Shape createShape(double radius, double width, double height) {
        System.out.println("Creating Triangle...");
        Triangle triangle = new Triangle();
        triangle.setBase(width);
        triangle.setHeight(height);
        return triangle;
    }
}
