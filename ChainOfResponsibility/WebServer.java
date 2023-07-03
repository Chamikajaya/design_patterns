package com.learn.DesignPatterns.Behavioural.ChainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(Request request) {
        handler.handle(request);
    }
}
