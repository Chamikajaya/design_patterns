package com.learn.DesignPatterns.Behavioural.ChainOfResponsibility;

public class Compressor extends Handler{
    public Compressor(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandleRequest(Request request) {
        System.out.println("Compressing...");
        // We need to return false because we need to call the next handler
        return false;
    }
}
