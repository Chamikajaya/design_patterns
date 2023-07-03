package com.learn.DesignPatterns.Behavioural.Visitor;

public interface Visitor {
    // Visitor interface
    void visit(LifeInsuranceElement lifeInsuranceElement);
    void visit(HealthInsuranceElement healthInsuranceElement);


}
