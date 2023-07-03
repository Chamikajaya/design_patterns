package com.learn.DesignPatterns.Behavioural.Factory.ShapeDesign;

public class TestDrive {
    public static void main(String[] args) {
        ShapeFactory myFactory1 = new CircleFactory();
        Shape circle = myFactory1.createShape(7, 0, 0);
        circle.findArea();
        circle.findPerimeter();
        System.out.println();
        ShapeFactory myFactory2 = new RectangleFactory();
        Shape rectangle = myFactory2.createShape(0, 10, 5);
        rectangle.findArea();
        rectangle.findPerimeter();
        System.out.println();
        ShapeFactory myFactory3 = new TriangleFactory();
        Shape triangle = myFactory3.createShape(0, 12, 6);
        triangle.findArea();
        triangle.findPerimeter();

    }
}
