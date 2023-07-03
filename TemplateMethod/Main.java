package com.learn.DesignPatterns.Behavioural.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Bread whiteBread = new WhiteBread();
        whiteBread.prepareBreadTemplateMethod();

        System.out.println();

        Bread grainBread = new GrainBread();
        grainBread.prepareBreadTemplateMethod();

    }
}
