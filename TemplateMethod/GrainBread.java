package com.learn.DesignPatterns.Behavioural.TemplateMethod;

public class GrainBread extends Bread{
    @Override
    public void mixIngredients() {
        System.out.println("Mixing the ingredients for grain bread");
    }

    @Override
    public void bakeBread() {
        System.out.println("Baking the grain bread");
    }
}
