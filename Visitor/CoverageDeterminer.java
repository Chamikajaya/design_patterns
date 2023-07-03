package com.learn.DesignPatterns.Behavioural.Visitor;

public class CoverageDeterminer implements Visitor{
    @Override
    public void visit(LifeInsuranceElement lifeInsuranceElement) {
        System.out.println("Determining coverage for life insurance");
    }

    @Override
    public void visit(HealthInsuranceElement healthInsuranceElement) {
        System.out.println("Determining coverage for health insurance");
    }
}
