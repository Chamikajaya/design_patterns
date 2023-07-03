package com.learn.DesignPatterns.Behavioural.State;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Select the portion of the image ");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");

    }
}
