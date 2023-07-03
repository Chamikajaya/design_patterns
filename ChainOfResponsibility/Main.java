package com.learn.DesignPatterns.Behavioural.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // Streamline ===> Authenticator ===> Logger ===> Compressor
        WebServer webServer = new WebServer(new Authenticator(new Logger(new Compressor(null))));
        webServer.handle(new Request("admin", "1234"));

        // If the authentication was successful, then the request will be passed to the next handler Logger and then to Compressor.
        // If th authentication was unsuccessful, then the request will not be passed to the next handler.
    }
}
