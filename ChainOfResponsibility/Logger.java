package com.learn.DesignPatterns.Behavioural.ChainOfResponsibility;

public class Logger extends Handler{
    @Override
    public boolean doHandleRequest(Request request) {
        System.out.println("Logging...");
        return false;
    }

    public Logger(Handler nextHandler) {
        super(nextHandler);
    }
}
