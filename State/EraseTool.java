package com.learn.DesignPatterns.Behavioural.State;

public class EraseTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Erase the selected part");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase icon");
    }
}
