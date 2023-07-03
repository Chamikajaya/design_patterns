package com.learn.DesignPatterns.Behavioural.Visitor;

public class HealthInsuranceElement implements InsuaranceElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
