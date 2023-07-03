package com.learn.DesignPatterns.Behavioural.Visitor;

public class LifeInsuranceElement implements InsuaranceElement{
    @Override
    public void accept(Visitor visitor) {  // To accept a visitor
        visitor.visit(this);
    }
}
