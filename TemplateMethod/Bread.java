package com.learn.DesignPatterns.Behavioural.TemplateMethod;

public abstract class Bread {

    // This is the template method that is final and cannot be overridden by the sub classes.
    final void prepareBreadTemplateMethod(){
        mixIngredients();
        needleDough();
        riseDough();
        bakeBread();
        sliceBread();
    }
    public void needleDough(){
        System.out.println("Needling the dough");
    }
    public void riseDough(){
        System.out.println("Letting the dough rise");
    }
    public void sliceBread(){
        System.out.println("Slicing the bread");
    }
    public abstract void mixIngredients();
    public abstract void bakeBread();


}
