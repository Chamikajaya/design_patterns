package com.learn.DesignPatterns.Behavioural.Proxy;

public class RealFileStorage implements FileStorage{
    @Override
    public void uploadFile(String file) {
        System.out.println("Uploading " + file + " ...");
    }

    @Override
    public void downloadFile(String file) {
        System.out.println("Downloading " + file + " ...");
    }
}
