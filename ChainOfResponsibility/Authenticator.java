package com.learn.DesignPatterns.Behavioural.ChainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandleRequest(Request request) {
        boolean isAuthenticated = (request.getUsername().equals("admin") && request.getPassword().equals("1234"));
        System.out.println("Authentication " + (isAuthenticated ? "Successful" : "Failed"));
        // If the request is valid we need to call the next handler (compressor, logger,...)
        // Thus we need to return False
        return !isAuthenticated;

    }
}
