package com.learn.DesignPatterns.Behavioural.Visitor;

public class Main {
    public static void main(String[] args) {

        // Since we have used visitor pattern we are able to use the visitors (tools) on elements without having to change the implementation of elements
        Visitor premiumCalc = new PremiumCalc();
        Visitor coverageDeterminer = new CoverageDeterminer();

        InsuaranceElement lifeInsurance = new LifeInsuranceElement();
        InsuaranceElement healthInsurance = new HealthInsuranceElement();

        lifeInsurance.accept(premiumCalc);
        lifeInsurance.accept(coverageDeterminer);

        System.out.println();

        healthInsurance.accept(premiumCalc);
        healthInsurance.accept(coverageDeterminer);

    }
}
