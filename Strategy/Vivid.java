package com.learn.DesignPatterns.Behavioural.Strategy;

public class Vivid implements Filter{
    @Override
    public void applyFilter(String filename) {
        System.out.println("Applying Vivid filter to " + filename);
    }
}
