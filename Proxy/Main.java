package com.learn.DesignPatterns.Behavioural.Proxy;

public class Main {
    public static void main(String[] args) {
        FileStorage myManager = new ProxyFileStorage();

        myManager.uploadFile("Hello.py");
        System.out.println();
        myManager.downloadFile("myApp.java");
        System.out.println();
        myManager.downloadFile("myApp.java");


    }
}
