package com.learn.DesignPatterns.Behavioural.Visitor;

public class PremiumCalc implements Visitor {
    // Concrete Visitor
    @Override
    public void visit(LifeInsuranceElement lifeInsuranceElement) {
        System.out.println("Calculating premium for life insurance");
    }

    @Override
    public void visit(HealthInsuranceElement healthInsuranceElement) {
        System.out.println("Calculating premium for health insurance");

    }
}
