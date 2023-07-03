package com.learn.DesignPatterns.Behavioural.ChainOfResponsibility;

public abstract class Handler {
    private Handler nextHandler;

    public Handler(Handler nextHandler) {  // To set the next handler
        this.nextHandler = nextHandler;
    }

    // To check whether the request is completely handled. If the request is handled we will return
    // Otherwise we will pass the request to the next handler
    public void handle(Request request) {
        if (doHandleRequest(request))
            return;
        if (nextHandler != null)
            nextHandler.handle(request);
    }


    // To handle the request
    public abstract boolean doHandleRequest(Request request);


}
