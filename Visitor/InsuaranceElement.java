package com.learn.DesignPatterns.Behavioural.Visitor;

public interface InsuaranceElement  {
    // Every element should have a method to accept a visitor
    void accept(Visitor visitor);
}
